FROM openjdk:18

WORKDIR /usr/src/app

COPY ./target/k8s-1.0-SNAPSHOT.jar .

CMD ["java", "-jar", "k8s-1.0-SNAPSHOT.jar"]
