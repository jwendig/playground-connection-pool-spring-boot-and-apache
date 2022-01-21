package de.test.serverapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerRestController {

	@GetMapping("/server-endpoint")
	public String severEndpoint() {
		return "I am in server";
	}

}
