#!/usr/bin/env bash
mvn clean package && cp ./target/dasniko.keycloak-demo-user-spi.jar ../keycloak-demos/providers/
