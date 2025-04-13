FROM openjdk:17-jdk-slim
MAINTAINER anwaar.alkhalili98@gmail.com
WORKDIR /app
EXPOSE 8089
COPY /target/assignment2.jar /app/assignment2.jar
ENTRYPOINT ["java","-jar","assignment2.jar"]
