### Spring Microservices
Spring Cloud microservices example

### Ports:
- Eureka (Service Discovery): 8761
- Cardservice: 8081
- Cardholder: 8082
- Zuul: 8888 (API Gateway for Cardservice: localhost:8888/api/card-service/add/{cardNumber})
- Hystrix Dashbord: 7979 (for localhost:8081/hystrix.stream)
- Config Server: TODO

### Technologies
- Java 8
- Spring Boot
- Spring Cloud Netflix (Eureka, Zuul, Hystrix)




