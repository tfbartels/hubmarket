package br.com.hubmarket.auth;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController

public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Microserviço de usuario";
    }
}
