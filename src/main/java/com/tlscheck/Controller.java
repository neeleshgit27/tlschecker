package com.tlscheck;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/webhooks")
@CrossOrigin
public class Controller {
	
	private static final org.slf4j.Logger s_log = LoggerFactory.getLogger(Controller.class);

	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void getMessage(@PathVariable("id") String id) {
		s_log.info("Received GET request with id:"+ id);
	}
	

	@PostMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void postMessage(@PathVariable("id") String id) {
		s_log.info("Received POST request for {0} but no data package exists", id);
	}
}
