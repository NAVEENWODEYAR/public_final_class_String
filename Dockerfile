# Dockerfile,
FROM openjdk:21
RUN mkdir/usr/app
COPY target/Sting.jar /usr/app
WORKDIR /usr/app
ENTRYPOINT [ "java","-jar","Sting.jar" ]