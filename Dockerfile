FROM openjdk:11
EXPOSE 8080
ADD target/CICD_Project.jar CICD_Project.jar
ENTRYPOINT ["java","-jar","/CICD_Project.jar"]