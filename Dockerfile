FROM openjdk:17-jdk-slim
MAINTAINER anwaar.alkhalili98@gmail.com
WORKDIR /app
EXPOSE 8085
COPY /target/gateway-server.jar /app/gateway-server.jar
ENTRYPOINT ["java","-jar","gateway-server.jar"]