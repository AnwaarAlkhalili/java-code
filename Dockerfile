FROM openjdk:17-jdk-slim
MAINTAINER anwaar.alkhalili98@gmail.com
WORKDIR /app
EXPOSE 8761
COPY /target/discovery-server.jar /app/discovery-server.jar
ENTRYPOINT ["java","-jar","discovery-server.jar"]