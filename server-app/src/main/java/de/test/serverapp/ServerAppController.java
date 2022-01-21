package de.test.serverapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerAppController {

    @GetMapping("/hello")
    public String simpleGet(){
        return "hey i am the server-app";
    }

    @PostMapping("/hello")
    public String simplePost(@RequestBody String body){
        return "hey i am the server-app - you sent: " + body;
    }

}
