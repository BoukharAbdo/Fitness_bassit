package com.Association_sportive_bassit.Controlles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class GreetingController {
	
	@GetMapping(value = "/greeting")
    public String get() {
        
        return "test";
    }

}
