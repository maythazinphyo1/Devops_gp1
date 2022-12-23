FROM openjdk:latest
COPY ./target/Devops_gp1.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "Devops_gp1.jar", "db:3306", "30000"]