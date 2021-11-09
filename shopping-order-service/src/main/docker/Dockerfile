FROM openjdk:8-jre-alpine

LABEL author="Bharathidasan"
MAINTAINER mailtobmanickam@gmail.com

# environment
EXPOSE 8083

# executable ADD @project.artifactId@-@project.version@.jar app.jar
ADD shopping-order-service.jar app.jar

# run app as user 'booter'
RUN /bin/sh -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","/app.jar"]