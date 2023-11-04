FROM openjdk:17.0.1-jdk-slim
WORKDIR /app
COPY build/libs/spring-svc-b-0.0.1-SNAPSHOT.jar spring-svc-b.jar
EXPOSE 8702
CMD ["java", "-jar", "spring-svc-b.jar"]