FROM openjdk:17-alpine

WORKDIR /app
COPY target/holy-bible-acf-0.0.1-SNAPSHOT.jar /app/holy-bible-acf-0.0.1-SNAPSHOT.jar

EXPOSE 8080

CMD ["java", "-jar", "holy-bible-acf-0.0.1-SNAPSHOT.jar"]
