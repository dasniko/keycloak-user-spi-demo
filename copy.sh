#!/usr/bin/env bash
mvn clean package && cp ./target/keycloak-demo-user-spi.jar ../deployments/
