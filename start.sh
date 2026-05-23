#!/usr/bin/env bash

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"

start_backend() {
  mvn spring-boot:run -f "${ROOT_DIR}/backend/pom.xml"
}

start_frontend() {
  cd "${ROOT_DIR}/frontend"
  if [ ! -d node_modules ]; then
    npm install
  fi
  npm start
}

start_backend &
BACKEND_PID=$!

start_frontend &
FRONTEND_PID=$!

cleanup() {
  kill "${BACKEND_PID}" "${FRONTEND_PID}" 2>/dev/null || true
}
trap cleanup EXIT

wait
