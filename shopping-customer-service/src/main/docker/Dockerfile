FROM openjdk:8-jre-alpine

LABEL author="Bharathidasan"
MAINTAINER mailtobmanickam@gmail.com

# environment
EXPOSE 8082

# executable ADD @project.artifactId@-@project.version@.jar customer.jar
ADD shopping-customer-service.jar app.jar

# run app as user 'booter'
RUN /bin/sh -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","/app.jar"]