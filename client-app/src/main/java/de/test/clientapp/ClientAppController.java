package de.test.clientapp;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
@Slf4j
public class ClientAppController {

    private final RestTemplate restTemplate;

    @GetMapping("/hello")
    public String hello(){
        return "hey i am the client-app";
    }

    @GetMapping("/request-to-server-app")
    public String requestToServerApp(){
        try {
            String responseFromServerApp = restTemplate.getForObject("http://server-apache/hello", String.class);
            return "answer from server-app: " + responseFromServerApp;
        }catch (Exception e){
            log.error("fuck", e);

            return "error from server-app: " + e.getMessage();
        }


    }

}
