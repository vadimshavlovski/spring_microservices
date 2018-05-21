package cardservice;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CreditCardService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "returnFail")
    public Integer addCardNumber(String cardNumber) {

        // some card validation
        //...
        System.out.println("Sending card number: " + cardNumber);

        Integer token = restTemplate.getForObject("http://CARDHOLDER/add/" + cardNumber, Integer.class);

        System.out.println("Received token " + token);
        return token;
    }

    public Integer returnFail(String cardNumber) {
        throw new RuntimeException("Credit Card Holder service is unreachable");
    }

}
