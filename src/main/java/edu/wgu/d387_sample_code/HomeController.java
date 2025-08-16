package edu.wgu.d387_sample_code;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping({"/", "/index"})
    public String home() {
        return "index";
    }
}
