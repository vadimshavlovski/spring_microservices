package cardholder;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HolderResource {

    private Map<String, Integer> cardNumberTokenMap;
    private Integer currentToken;

    public HolderResource() {
        this.cardNumberTokenMap = new HashMap<>();
        this.currentToken = 1;
    }

    @GetMapping("/add/{cardNumber}")
    public Integer addCardNumber(@PathVariable String cardNumber) {
        System.out.println("Card Number: " + cardNumber);

        // some card validation
        //...

        Integer token = cardNumberTokenMap.get(cardNumber);

        if(token == null){
            token = currentToken;
            cardNumberTokenMap.put(cardNumber, token);
            ++currentToken;
        }

        System.out.println("Token: " + token);
        return token;
    }

}
