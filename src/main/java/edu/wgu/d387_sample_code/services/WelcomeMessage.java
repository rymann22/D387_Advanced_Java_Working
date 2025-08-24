package edu.wgu.d387_sample_code.services;

import java.util.Locale;
import java.util.ResourceBundle;

public class WelcomeMessage {
    public static String getWelcomeMessage(Locale locale) {
        ResourceBundle bundle = ResourceBundle.getBundle("welcome", locale);
        return bundle.getString("welcome");
    }
}
