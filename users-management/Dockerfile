FROM openjdk:11
EXPOSE 8801
ADD /target/users-management-1.0.0-SNAPSHOT.jar UsersManagement.jar
ENTRYPOINT [ "java", "-jar", "UsersManagement.jar" ]