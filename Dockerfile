FROM openjdk:17-jdk-slim
MAINTAINER anwaar.alkhalili98@gmail.com
WORKDIR /app
EXPOSE 8080
COPY /target/product-service.jar /app/product-service.jar
ENTRYPOINT ["java","-jar","product-service.jar"]