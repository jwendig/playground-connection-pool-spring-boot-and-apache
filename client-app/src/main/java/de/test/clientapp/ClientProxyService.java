package de.test.clientapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ClientProxyService {

	@Autowired
	private RestTemplate restTemplate;

	public ResponseEntity<String> getSomeInfo() {
		return restTemplate.getForEntity("http://server-app:8080/server-endpoint", String.class);
	}
}
