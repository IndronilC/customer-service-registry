FROM openjdk:17

ARG JAR_FILE=build/libs/*.jar

COPY ${JAR_FILE} customer-service-registry.jar

ENTRYPOINT ["java", "-jar", "/customer-service-registry.jar"]

EXPOSE 8761