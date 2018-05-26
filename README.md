### Spring Microservices
Spring Cloud microservices example

### Services:
- Eureka (Service Discovery): 
  port:8761 
- Cardservice: port: 8081
- Cardholder: port: 8082
- Zuul: port: 8888 (API Gateway for Cardservice: localhost:8888/api/card-service/add/{cardNumber})
- Hystrix Dashbord: port: 7979 (hystrix stream: localhost:8081/hystrix.stream)
- Config Server: TODO (support for externalized configuration)

| Microservice        | Port | Microservices Pattern  | Test URL        |
| ---------------------------------------- | ---- | ---------------------- | --------------- |
| zuul-api-gateway    | 8050 | API Gateway            | localhost:8888/api/card-service/add/{cardNumber}|
|                                          |      |                        |                 |

### Technologies
- Java 8
- Spring Boot
- Spring Cloud Netflix (Eureka, Zuul, Hystrix)




