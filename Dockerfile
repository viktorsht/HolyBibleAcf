# Stage 1: Build Stage
FROM maven:3.8.4-openjdk-17-slim AS build

COPY src /app/src
COPY pom.xml /app

WORKDIR /app

RUN mvn clean install

FROM openjdk:17-jdk-slim

COPY --from=build /app/target/*.jar /app/app.jar

WORKDIR /app

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/app.jar"]
