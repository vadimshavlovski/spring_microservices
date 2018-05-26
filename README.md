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
| credit-card-service  |8081  |     -            | localhost:8081/add{cardNumber}            |
| card-number-holder  |8082  |     -            | localhost:8082/add{cardNumber}            |
| config-server  |8040  | Config-Server(support for externalized configuration) |            |
| eureka-service-discovery  |8761  | Service Discovery |localhost:8761|
| zuul-api-gateway |8888| API Gateway|localhost:8888/api/card-service/add/{cardNumber}|
| hystrix-health-dashboard |7979| Health |hystrix stream: localhost:8081/hystrix.stream|
|                                          |      |                        |                 |

### Technologies
- Java 8
- Spring Boot
- Spring Cloud Netflix (Eureka, Zuul, Hystrix)




