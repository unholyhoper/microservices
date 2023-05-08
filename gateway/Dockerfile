FROM openjdk:11
EXPOSE 8762
ADD /target/gateway-1.0.0-SNAPSHOT.jar gateway.jar
ENTRYPOINT [ "java", "-jar", "gateway.jar" ]