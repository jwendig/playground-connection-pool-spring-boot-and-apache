FROM openjdk:11
ADD target/client-app-0.0.1-SNAPSHOT.jar /opt/spring/client-app.jar
EXPOSE 8080
WORKDIR /opt/spring/
ENTRYPOINT ["java", "-jar", "client-app.jar"]