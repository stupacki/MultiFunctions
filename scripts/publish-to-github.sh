#!/usr/bin/env sh
set -eu

usage() {
  cat <<'EOF'
Usage: ./publish-to-github.sh VERSION

Publishes all multi-functions artifacts to GitHub Packages with VERSION.

Required environment:
  GITHUB_USER    GitHub username used for publishing
  GITHUB_TOKEN   Token with package publishing permissions

Example:
  ./publish-to-github.sh 2.1.0
EOF
}

if [ "$#" -ne 1 ]; then
  usage
  exit 1
fi

case "$1" in
  -h|--help)
    usage
    exit 0
    ;;
esac

ARTIFACT_VERSION="$1"

if [ -z "${GITHUB_USER:-}" ]; then
  echo "GITHUB_USER is not set."
  exit 1
fi

if [ -z "${GITHUB_TOKEN:-}" ]; then
  echo "GITHUB_TOKEN is not set."
  exit 1
fi

./gradlew :multi-functions:publishAllPublicationsToGitHubPackagesRepository \
  -Pgpr.user="$GITHUB_USER" \
  -Pgpr.key="$GITHUB_TOKEN" \
  -PartifactVersion="$ARTIFACT_VERSION" \
  --no-configuration-cache
