FROM openjdk:11-jdk-alpine
WORKDIR /app
COPY target/springboot-containerization.jar /springboot-docker-containerization.jar
EXPOSE 8080
CMD ["java", "-jar", "/springboot-docker-containerization.jar"]
