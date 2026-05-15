#!/usr/bin/env sh
set -eu

usage() {
  cat <<'EOF'
Usage: ./scripts/publish-to-github.sh [VERSION]

Publishes all multi-functions artifacts to GitHub Packages.
When VERSION is provided, it overrides artifactVersion from gradle.properties.

Required environment:
  GITHUB_USER    GitHub username used for publishing
  GITHUB_TOKEN   Token with package publishing permissions

Example:
  ./scripts/publish-to-github.sh
  ./scripts/publish-to-github.sh 2.1.0
EOF
}

if [ "$#" -gt 1 ]; then
  usage
  exit 1
fi

case "${1:-}" in
  -h|--help)
    usage
    exit 0
    ;;
esac

if [ -z "${GITHUB_USER:-}" ]; then
  echo "GITHUB_USER is not set."
  exit 1
fi

if [ -z "${GITHUB_TOKEN:-}" ]; then
  echo "GITHUB_TOKEN is not set."
  exit 1
fi

if [ "$#" -eq 1 ]; then
  ARTIFACT_VERSION_ARGS="-PartifactVersion=$1"
else
  ARTIFACT_VERSION_ARGS=""
fi

./gradlew :multi-functions:publishAllPublicationsToGitHubPackagesRepository \
  -Pgpr.user="$GITHUB_USER" \
  -Pgpr.key="$GITHUB_TOKEN" \
  $ARTIFACT_VERSION_ARGS \
  --no-configuration-cache
