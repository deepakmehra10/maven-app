FROM java:8
WORKDIR /
ADD /target/maven-app-1.0-SNAPSHOT-jar-with-dependencies.jar maven-app-1.0-SNAPSHOT-jar-with-dependencies.jar
EXPOSE 8080
CMD java -jar ./maven-app-1.0-SNAPSHOT-jar-with-dependencies.jar
