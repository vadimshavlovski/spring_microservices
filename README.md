### Spring Microservices
Spring Cloud microservices example

### Microservices

| Microservice           | Port | Pattern                 |Test URL                          |
| ---------------------  | ---- | ------------------------|----------------------------------|
|zuul-api-gateway        | 8050 | API Gateway             |/api/card-service/add/{cardNumber}|
|credit-card-service     | 8081 |     -                   |/add/{cardNumber}                 |
|card-number-holder      | 8082 |     -                   |/add/{cardNumber}                 |
|config-server           | 8040 | Configuration Management|/cardservice/dev (refer to 'config repo')|
|eureka-service-discovery| 8761 | Service Discovery       |/                                 |
|hystrix-health-dashboard| 7979 | Fault Tolerance         |/hystrix.stream                   |
|                        |      |                         |                                  |

### Technologies
- Java 8
- Spring Boot
- Spring Cloud Netflix (Eureka, Zuul, Hystrix)
- Spring Cloud Config Server




