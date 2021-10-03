# Microservices E-commerce Sample Project


This microservices e-commerce sample project demonstrates how multiple services on the best microservices architecture to enable and scale the product.

### UseCase

The sample application has two services namely shopping-customer-service and shopping-order-service, for authorization the service name as shopping-auth-service.
To get the customer details and get the respective order details for the customer.


#### Service Discovery

 When one service needs to access a resource from another service , all it has to do is ask discovery and registration server (Consul) to give one of the service information.


### Components Integrated & Tools Usage   
##### API Gateway
   
Netflix Zuul is a the reverse proxy server which acts as the API Gateway for accessing the micro services behind this it's routes the request to the respective service. Microservice’s stay behind reverse proxy server and needs to be consumed via api gateway. The api-gateway micro service with docker profile runs on port 8080 and can be accessed by http://localhost:8080 .   

Configuration done in API Gateway for Routing:   
```
zuul:
  ignoredServices: '*'
  sensitive-headers:
  - Cookie,Set-Cookie
  host:
    connect-timeout-millis: 60000
    socket-timeout-millis: 60000    
  routes:
    customer-service:
      path: /customer-api/**
      serviceId: shopping-customer-service
    order-service:
      path: /order-api/**
      serviceId: shopping-order-service
    auth-service:
      path: /auth-api/**
      serviceId: shopping-auth-service
```

##### Service registration and discovery   

Registration and discovery is taken care by the HashiCorp’s Consul. During the startup of the individual services, they register with service registration service those details such as host name, port etc. by which the services can be accessed. Once the service is registered to the consul, consul checks for the health of the service by sending a heartbeat for the health check path and health check interval that has been registered with Consul. Requests to the micro-services has to be routed through shopping-api-gateway during with the shopping-api-gateway contacts discovery service to get the information required to send the request to the intended microservice. 

Configuration done in microservices to register to Consul:   
```
# CONSUL CONFIGURATION
spring:
  profiles: dev
  cloud:
    consul:
      host: consul
      port: 8500
      discovery:
        hostname: shopping-customer-service
        instanceId: ${spring.application.name}:${spring.application.instance_id:${random.value}}
        healthCheckPath: /actuator/health
        healthCheckInterval: 15s
```
Consul management can be accessed through -  http://localhost:8500/ui/  

### Technology

Microservices sample project uses a number of open source projects to work properly:

* [SpringBoot] - REST API Application framework
* [Zuul] - API Gateway (Load Balancer)
* [Consul] - Service Registration and Discovery
* [Docker] - Containerization
* [Logstash] - Log collector
* [Elasticsearch] - Log indexer
* [Kibana] - Log Data visualization
* [Swagger] - API documentation

### Tools

* [Java] - Programming
* [Maven] - Build
* [Git] - Version control
* [Docker] - Deployment

### Development

Follow the steps to bring up the development environment in your local and access the service.

1) Install Git, Java, Maven and Docker</br>
2) Clone the project using "git clone https://github.com/Bharathidasan-tech/microservices-e-commerce-sample.git" /br>
3) Run the command "cd /microservices-e-commerce-sample/build/docker/scripts/"</br>
4) Deploy Docker - run "sh ./deploy.sh dev".</br>
5) Access the Application at http://localhost:8080/</br>
6) To stop and Removing all containers - run "sh ./clean.sh".</br></br>


[//]: # (These are reference links used in the body of this note and get stripped out when the markdown processor does its job.)


   [SpringBoot]: <https://projects.spring.io/spring-boot/>
   [Consul]: <https://www.consul.io>
   [Docker]: <https://www.docker.com>
   [Zuul]: <https://github.com/Netflix/zuul/wiki>
   [Kitematic]: <https://kitematic.com>
   [Maven]: <https://maven.apache.org>
   [MySQL]: <https://www.mysql.com>
   [Git]: <https://git-scm.com>
   [Java]: <https://go.java>
   [Logstash]: <https://www.elastic.co/products/logstash>
   [Elasticsearch]: <https://www.elastic.co/products/elasticsearch>
   [Kibana]: <https://www.elastic.co/products/kibana>
   [Swagger]: <https://swagger.io/>
   