package cardservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class CreditCardResource {

    @Value("${externalField}")
    private String externalField;

    @Autowired
    private CreditCardService creditCardService;

    @GetMapping("/add/{cardNumber}")
    public Integer addCardNumber(@PathVariable String cardNumber) {
        return creditCardService.addCardNumber(cardNumber);
    }

    @GetMapping("/config-server-test")
    public String checkConfigServerInject() {
        return this.externalField;
    }

}
