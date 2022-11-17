FROM openjdk:11
EXPOSE 8082
ADD ./target/feedback-service-1.0-SNAPSHOT-jar-with-dependencies.jar feedback-service-1.0-SNAPSHOT-jar-with-dependencies.jar
ENTRYPOINT "Java","-jar","feedback-service-1.0-SNAPSHOT-jar-with-dependencies.jar"
