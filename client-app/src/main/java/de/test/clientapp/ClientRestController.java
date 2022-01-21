package de.test.clientapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientRestController {

	@GetMapping("/try")
	public String clientEndpoint() {
		return "";
	}
}
