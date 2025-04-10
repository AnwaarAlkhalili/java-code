FROM openjdk:17-jdk-slim
MAINTAINER anwaar.alkhalili98@gmail.com
WORKDIR /app
EXPOSE 8080
COPY /target/customer-service.jar /app/customer-service.jar
ENTRYPOINT ["java","-jar","customer-service.jar"]