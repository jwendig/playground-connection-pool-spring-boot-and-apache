package de.test.serverapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerAppController {

    @GetMapping("/hello")
    public String simple(){
        return "hey i am the server-app";
    }

}
