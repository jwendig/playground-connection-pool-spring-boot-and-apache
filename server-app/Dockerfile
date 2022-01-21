FROM openjdk:11
ADD target/server-app-0.0.1-SNAPSHOT.jar /opt/spring/server-app.jar
EXPOSE 8080
WORKDIR /opt/spring/
ENTRYPOINT ["java", "-jar", "server-app.jar"]