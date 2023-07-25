#define base docker image
FROM openjdk:17
LABEL maintainer="javaguides.net"
ADD target/bassit-fitness.jar springboot-docker-demo.jar
ENTRYPOINT ["java", "-jar", "springboot-docker-demo.jar"]