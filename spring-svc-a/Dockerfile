FROM openjdk:17.0.1-jdk-slim
WORKDIR /app
COPY build/libs/spring-svc-a-0.0.1-SNAPSHOT.jar spring-svc-a.jar
EXPOSE 8701
CMD ["java", "-jar", "spring-svc-a.jar"]