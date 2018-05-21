package cardservice;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CreditCardResource {

    @Autowired
    private CreditCardService creditCardService;

    @GetMapping("/add/{cardNumber}")
    public Integer addCardNumber(@PathVariable String cardNumber) {
        return creditCardService.addCardNumber(cardNumber);
    }

}
