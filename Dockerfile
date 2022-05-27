FROM adoptopenjdk/openjdk11:alpine-jre
#VOLUME /tmp
#ARG JAR_FILE
ARG JAR_FILE=target/*.jar 
COPY ${JAR_FILE} config-server-service.jar
ENTRYPOINT ["java", "-jar", "/config-server-service.jar"]