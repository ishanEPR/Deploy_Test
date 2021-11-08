FROM openjdk:17
EXPOSE 8080
ADD target/deploy-test.jar deploy-test.jar
ENTRYPOINT ["java","-jar","/deploy-test.jar"]