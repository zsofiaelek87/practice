FROM maven:3.8.7-eclipse-temurin-19
COPY target/FruitMockService-*.jar fruit.jar
EXPOSE 8080
CMD ["java", "-jar", "fruit.jar"]