FROM openjdk:17-jdk-slim
MAINTAINER anwaar.alkhalili98@gmail.com
WORKDIR /app
EXPOSE 8082
COPY /target/transaction-service.jar /app/transaction-service.jar
ENTRYPOINT ["java","-jar","transaction-service.jar"]