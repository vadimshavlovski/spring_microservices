### Spring Microservices
Spring Cloud microservices example :boom: :boom: :boom:

### Technologies
- Java 8
- Spring Boot
- Spring Cloud Netflix (Eureka, Zuul, Hystrix)
- Spring Cloud Config Server

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

### API Gateway (Zuul)

   ![api_gateway_zuul](https://github.com/vadimshavlovski/spring_microservices/blob/master/config-repo/api-gateway-zuul.png)

### Config Server 
Todo

### Service Discovery (Eureka)
Todo

### Fault Tolerance (Hystrix + Health Dashboard)
Todo

