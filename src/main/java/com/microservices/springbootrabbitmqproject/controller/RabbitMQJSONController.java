package com.microservices.springbootrabbitmqproject.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.springbootrabbitmqproject.bean.User;
import com.microservices.springbootrabbitmqproject.producer.RabbitMQJSONProducer;

@RestController
@RequestMapping("/api/v1")
public class RabbitMQJSONController {
	
	private RabbitMQJSONProducer jsonProducer;
	
	public RabbitMQJSONController(RabbitMQJSONProducer jsonProducer) {
		this.jsonProducer = jsonProducer;
	}

	@PostMapping("/publish/json")
	public ResponseEntity<String> jsonPublish(@RequestBody User user )
	{
		jsonProducer.sendJSONMessage(user);
		return ResponseEntity.ok("JSON Message sent to rabbitMQ ....");
	}
}
