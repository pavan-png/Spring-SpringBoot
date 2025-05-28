package in.orcas.service;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class MessageService {

    @Autowired
    private MessageSource messageSource;

    public void showMessages() {
        System.out.println("EN: " + messageSource.getMessage("greeting", null, Locale.ENGLISH));
        System.out.println("FR: " + messageSource.getMessage("greeting", null, Locale.FRENCH));
        System.out.println("HI: " + messageSource.getMessage("greeting", null, new Locale("hi", "IN")));
    }
}
