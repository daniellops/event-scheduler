FROM openjdk:17-jdk

WORKDIR /app

COPY target/event-scheduler-1.0-SNAPSHOT.jar /app/

CMD ["java", "-jar", "event-scheduler-1.0-SNAPSHOT.jar"]