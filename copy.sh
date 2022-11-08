#! /bin/bash
mvn clean package -DskipTests && cp target/dasniko.*.jar ../keycloak-demos/providers
