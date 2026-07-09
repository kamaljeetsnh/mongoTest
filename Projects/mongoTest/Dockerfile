FROM openjdk:17-jdk-slim
expose 8080
add target/mongoTest-0.0.1-SNAPSHOT.jar mongoTest.jar
entrypoint ["java","-jar","/mongoTest.jar"]