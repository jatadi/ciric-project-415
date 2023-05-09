FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} bookshelf-service.jar
CMD ["java", "-jar", "bookshelf-service.jar"]
EXPOSE 8082