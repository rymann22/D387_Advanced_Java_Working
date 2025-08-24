package edu.wgu.d387_sample_code.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import edu.wgu.d387_sample_code.services.WelcomeMessage;

@RestController
public class WelcomeRestController {

    @GetMapping("/api/welcome")
    public Map<String, String> getWelcomeMessages() {
        Map<String, String> messages = new HashMap<>();
        messages.put("en", WelcomeMessage.getWelcomeMessage(new Locale("en", "US")));
        messages.put("fr", WelcomeMessage.getWelcomeMessage(new Locale("fr", "CA")));
        return messages;
    }
}
