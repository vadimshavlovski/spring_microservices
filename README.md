### Spring Microservices
Spring Cloud microservices example

### Microservices

| Microservice         | Port | Microservices Pattern   |Test URL                                        |
| ---------------------| ---- | ------------------------|----------------------------------------------- |
|zuul-api-gateway      | 8050 | API Gateway             |localhost:8888/api/card-service/add/{cardNumber}|
|credit-card-service   | 8081 |     -                   |localhost:8081/add{cardNumber}                  |
|card-number-holder    | 8082 |     -                   |localhost:8082/add{cardNumber}                  |
|config-server         | 8040 | Configuration Management|refer to config-repo                            |
|eureka-service-discovery| 8761 | Service Discovery     |localhost:8761                                  |
|zuul-api-gateway      | 8888 | API Gateway             |localhost:8888/api/card-service/add/{cardNumber}|
|hystrix-health-dashboard| 7979 | Fault Tolerance + Dashboard| hystrix stream: localhost:8081/hystrix.stream   |
|                      |      |                         |                                                 |

### Technologies
- Java 8
- Spring Boot
- Spring Cloud Netflix (Eureka, Zuul, Hystrix)




