package de.test.clientapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientRestController {

	@Autowired
	private ClientProxyService clientService;

	@GetMapping("/try")
	public String clientEndpoint() {
		return clientService.getSomeInfo().getBody();
	}
}
