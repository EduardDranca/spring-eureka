FROM openjdk:17.0.1-jdk-slim
WORKDIR /app
COPY ./build/libs/spring-eureka-0.0.1-SNAPSHOT.jar spring-eureka.jar
EXPOSE 8761
CMD ["java", "-jar", "spring-eureka.jar"]