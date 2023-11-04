FROM openjdk:17.0.1-jdk-slim
WORKDIR /app
COPY ./build/libs/spring-admin-0.0.1-SNAPSHOT.jar spring-boot-admin.jar
EXPOSE 8765
CMD ["java", "-jar", "spring-boot-admin.jar"]