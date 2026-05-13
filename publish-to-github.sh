#!/usr/bin/env sh
set -eu

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
  --no-configuration-cache
