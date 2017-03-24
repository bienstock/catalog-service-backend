#!/usr/bin/env bash

# build maven project
mvn clean install -DskipTests

# run docker compose
docker-compose up