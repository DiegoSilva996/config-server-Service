FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=target/*.jar 
COPY ${JAR_FILE} config-server-Service.jar
ENTRYPOINT ["java", "-jar", "/config-server-Service.jar"]