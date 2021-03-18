FROM openjdk:11.0.10-jre
COPY ./target/github-actions-test.jar /usr/src/github-action/
WORKDIR /usr/src/github-action
CMD ["java", "-jar", "github-actions-test.jar"]