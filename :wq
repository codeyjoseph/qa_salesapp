FROM maven:4.0.0-openjdk-11

WORKDIR /app

COPY pom.xml .

RUN mvn dependency:go-offline -B

COPY src ./src

RUN mvn package -DskipTests

CMD ["java", "-jar", "target/SalesApp-1.0-SNAPSHOT.jar"]
