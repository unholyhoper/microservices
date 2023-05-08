FROM openjdk:11
EXPOSE 8761
ADD /target/eureka-1.0.0-SNAPSHOT.jar EurekaServer.jar
ENTRYPOINT [ "java", "-jar", "EurekaServer.jar" ]