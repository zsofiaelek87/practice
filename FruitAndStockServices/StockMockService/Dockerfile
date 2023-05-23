FROM maven:3.8.7-eclipse-temurin-19
COPY target/StockMockService-*.jar stock.jar
EXPOSE 8080
CMD ["java", "-jar", "stock.jar"]