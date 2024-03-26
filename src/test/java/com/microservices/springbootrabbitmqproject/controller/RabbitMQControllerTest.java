package com.microservices.springbootrabbitmqproject.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import com.microservices.springbootrabbitmqproject.producer.RabbitMQProducer;

@SpringBootTest
public class RabbitMQControllerTest {
	
	@InjectMocks
	private RabbitMQController controller;
	
	@Mock
	private RabbitMQProducer producer;
	
	@Test
	public void testPublish()
	{
		ResponseEntity<String> rs = this.controller.publish("abc");
		Assertions.assertNotNull(rs);
	}

}
