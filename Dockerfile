FROM openjdk:8
EXPOSE 8081
ADD target/springboot-devops.jar springboot-devops.jar
ENTRYPOINT ["java","-jar","/springboot-devops.jar"]