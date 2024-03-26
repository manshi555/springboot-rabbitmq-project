package com.microservices.springbootrabbitmqproject.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import com.microservices.springbootrabbitmqproject.producer.RabbitMQJSONProducer;

@SpringBootTest
public class RabbitMQJSONControllerTest {
	
	@InjectMocks
	private RabbitMQJSONController controller;
	
	@Mock
	private RabbitMQJSONProducer producer;
	
	@Test
	public void testPublish()
	{
		ResponseEntity<String> rs = this.controller.jsonPublish(Mockito.any());
		Assertions.assertNotNull(rs);
	}

}
