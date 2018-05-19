package cardservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CreditCardResource {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/add/{cardNumber}")
    public Integer addCardNumber(@PathVariable String cardNumber) {

        // some card validation
        //...

        System.out.println("Sending card number: " + cardNumber);

        Integer token = restTemplate.getForObject("http://CARDHOLDER/add/" + cardNumber, Integer.class);
        System.out.println("Received token " + token);

        return token;
    }

}
