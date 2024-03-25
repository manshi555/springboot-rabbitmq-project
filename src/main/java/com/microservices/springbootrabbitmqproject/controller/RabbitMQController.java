package com.microservices.springbootrabbitmqproject.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.microservices.springbootrabbitmqproject.producer.RabbitMQProducer;

@RestController
@RequestMapping("/api/v1")
public class RabbitMQController {
	
	private RabbitMQProducer producer;
	
	public RabbitMQController(RabbitMQProducer producer) {
		this.producer = producer;
	}
	
	@GetMapping("/publish")
	public ResponseEntity<String> publish(@RequestParam("message") String message)
	{
		producer.sendMessage(message);
		return ResponseEntity.ok("Message sent to rabbitMQ ....");
	}
	

}
