#!/usr/bin/env sh
set -eu

usage() {
  cat <<'EOF'
Usage: ./delete-github-packages-version.sh VERSION [--execute]

Deletes GitHub Package versions matching VERSION across all packages owned by
GITHUB_OWNER. If VERSION is the only version of a package, the whole package is
deleted because GitHub does not allow deleting the final version directly. The
default is a dry run; pass --execute to actually delete.

Required environment:
  GITHUB_USER    GitHub username used for API authentication
  GITHUB_TOKEN   Token with read:packages and delete:packages permissions

Optional environment:
  GITHUB_OWNER       Package owner to inspect (default: stupacki)
  GITHUB_OWNER_TYPE  user or org (default: user)
  PACKAGE_TYPE       GitHub package type (default: maven)

Examples:
  ./delete-github-packages-version.sh 2.1.0
  ./delete-github-packages-version.sh 2.1.0 --execute
EOF
}

if [ "$#" -lt 1 ]; then
  usage
  exit 1
fi

case "$1" in
  -h|--help)
    usage
    exit 0
    ;;
esac

TARGET_VERSION="$1"
shift

EXECUTE=0
while [ "$#" -gt 0 ]; do
  case "$1" in
    --execute)
      EXECUTE=1
      ;;
    -h|--help)
      usage
      exit 0
      ;;
    *)
      echo "Unknown argument: $1"
      usage
      exit 1
      ;;
  esac
  shift
done

if [ -z "${GITHUB_USER:-}" ]; then
  echo "GITHUB_USER is not set."
  exit 1
fi

if [ -z "${GITHUB_TOKEN:-}" ]; then
  echo "GITHUB_TOKEN is not set."
  exit 1
fi

if ! command -v curl >/dev/null 2>&1; then
  echo "curl is required."
  exit 1
fi

if ! command -v python3 >/dev/null 2>&1; then
  echo "python3 is required for JSON parsing and URL encoding."
  exit 1
fi

GITHUB_OWNER="${GITHUB_OWNER:-stupacki}"
GITHUB_OWNER_TYPE="${GITHUB_OWNER_TYPE:-user}"
PACKAGE_TYPE="${PACKAGE_TYPE:-maven}"
API_BASE="https://api.github.com"
TMP_DIR="$(mktemp -d)"

cleanup() {
  rm -rf "$TMP_DIR"
}
trap cleanup EXIT INT TERM

api_request() {
  method="$1"
  path="$2"
  output_file="$3"

  status="$(
    curl -sS \
      -X "$method" \
      -H "Accept: application/vnd.github+json" \
      -H "X-GitHub-Api-Version: 2022-11-28" \
      -u "$GITHUB_USER:$GITHUB_TOKEN" \
      -o "$output_file" \
      -w "%{http_code}" \
      "$API_BASE$path"
  )"

  case "$status" in
    200|204)
      return 0
      ;;
    *)
      echo "GitHub API request failed: $method $path returned HTTP $status"
      if [ -s "$output_file" ]; then
        cat "$output_file"
      fi
      exit 1
      ;;
  esac
}

url_encode() {
  python3 -c 'from urllib.parse import quote; import sys; print(quote(sys.argv[1], safe=""))' "$1"
}

package_list_path() {
  page="$1"

  case "$GITHUB_OWNER_TYPE" in
    user)
      printf '/users/%s/packages?package_type=%s&per_page=100&page=%s' "$GITHUB_OWNER" "$PACKAGE_TYPE" "$page"
      ;;
    org)
      printf '/orgs/%s/packages?package_type=%s&per_page=100&page=%s' "$GITHUB_OWNER" "$PACKAGE_TYPE" "$page"
      ;;
    *)
      echo "GITHUB_OWNER_TYPE must be user or org."
      exit 1
      ;;
  esac
}

version_list_path() {
  package_name="$1"
  page="$2"
  encoded_package_name="$(url_encode "$package_name")"

  case "$GITHUB_OWNER_TYPE" in
    user)
      printf '/users/%s/packages/%s/%s/versions?per_page=100&page=%s' \
        "$GITHUB_OWNER" "$PACKAGE_TYPE" "$encoded_package_name" "$page"
      ;;
    org)
      printf '/orgs/%s/packages/%s/%s/versions?per_page=100&page=%s' \
        "$GITHUB_OWNER" "$PACKAGE_TYPE" "$encoded_package_name" "$page"
      ;;
  esac
}

delete_version_path() {
  package_name="$1"
  version_id="$2"
  encoded_package_name="$(url_encode "$package_name")"

  case "$GITHUB_OWNER_TYPE" in
    user)
      printf '/user/packages/%s/%s/versions/%s' "$PACKAGE_TYPE" "$encoded_package_name" "$version_id"
      ;;
    org)
      printf '/orgs/%s/packages/%s/%s/versions/%s' \
        "$GITHUB_OWNER" "$PACKAGE_TYPE" "$encoded_package_name" "$version_id"
      ;;
  esac
}

delete_package_path() {
  package_name="$1"
  encoded_package_name="$(url_encode "$package_name")"

  case "$GITHUB_OWNER_TYPE" in
    user)
      printf '/user/packages/%s/%s' "$PACKAGE_TYPE" "$encoded_package_name"
      ;;
    org)
      printf '/orgs/%s/packages/%s/%s' "$GITHUB_OWNER" "$PACKAGE_TYPE" "$encoded_package_name"
      ;;
  esac
}

extract_package_names() {
  python3 -c '
import json
import sys

data = json.load(sys.stdin)
for package in data:
    name = package.get("name")
    if name:
        print(name)
'
}

extract_matching_versions() {
  python3 -c '
import json
import sys

target = sys.argv[1]
data = json.load(sys.stdin)
for version in data:
    if str(version.get("name")) == target:
        print("{}\t{}".format(version.get("id"), version.get("name")))
' "$TARGET_VERSION"
}

package_file="$TMP_DIR/packages.txt"
: > "$package_file"

page=1
while :; do
  response_file="$TMP_DIR/packages-$page.json"
  api_request GET "$(package_list_path "$page")" "$response_file"
  page_package_file="$TMP_DIR/packages-$page.txt"
  extract_package_names < "$response_file" > "$page_package_file"

  if [ ! -s "$page_package_file" ]; then
    break
  fi

  cat "$page_package_file" >> "$package_file"
  page=$((page + 1))
done

if [ ! -s "$package_file" ]; then
  echo "No $PACKAGE_TYPE packages found for $GITHUB_OWNER_TYPE '$GITHUB_OWNER'."
  exit 0
fi

if [ "$EXECUTE" -eq 0 ]; then
  echo "Dry run: matching versions will be listed but not deleted."
  echo "Pass --execute to delete them."
fi

matches=0
deleted=0
packages_deleted=0

while IFS= read -r package_name; do
  page=1

  while :; do
    response_file="$TMP_DIR/versions-$package_name-$page.json"
    api_request GET "$(version_list_path "$package_name" "$page")" "$response_file"
    version_count="$(python3 -c 'import json, sys; print(len(json.load(sys.stdin)))' < "$response_file")"
    match_file="$TMP_DIR/matches-$package_name-$page.txt"
    extract_matching_versions < "$response_file" > "$match_file"

    count="$(wc -l < "$match_file" | tr -d ' ')"
    matches=$((matches + count))

    while IFS="$(printf '\t')" read -r version_id version_name; do
      if [ -z "$version_id" ]; then
        continue
      fi

      if [ "$EXECUTE" -eq 1 ]; then
        delete_response_file="$TMP_DIR/delete-$package_name-$version_id.json"
        if [ "$page" -eq 1 ] && [ "$version_count" -eq 1 ]; then
          api_request DELETE "$(delete_package_path "$package_name")" "$delete_response_file"
          packages_deleted=$((packages_deleted + 1))
          echo "Deleted $PACKAGE_TYPE package '$package_name' because '$version_name' was its only version (id: $version_id)."
        else
          api_request DELETE "$(delete_version_path "$package_name" "$version_id")" "$delete_response_file"
          echo "Deleted $PACKAGE_TYPE package '$package_name' version '$version_name' (id: $version_id)."
        fi
        deleted=$((deleted + 1))
      else
        if [ "$page" -eq 1 ] && [ "$version_count" -eq 1 ]; then
          echo "Would delete $PACKAGE_TYPE package '$package_name' because '$version_name' is its only version (id: $version_id)."
        else
          echo "Would delete $PACKAGE_TYPE package '$package_name' version '$version_name' (id: $version_id)."
        fi
      fi
    done < "$match_file"

    if [ "$version_count" -lt 100 ]; then
      break
    fi

    page=$((page + 1))
  done
done < "$package_file"

if [ "$matches" -eq 0 ]; then
  echo "No package versions named '$TARGET_VERSION' found."
elif [ "$EXECUTE" -eq 1 ]; then
  echo "Deleted $deleted package version(s) named '$TARGET_VERSION' including $packages_deleted whole package(s)."
else
  echo "Found $matches package version(s) named '$TARGET_VERSION'. No deletions were made."
fi
