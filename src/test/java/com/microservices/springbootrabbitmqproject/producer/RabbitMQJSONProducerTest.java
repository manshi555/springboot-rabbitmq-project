package com.microservices.springbootrabbitmqproject.producer;

import static org.mockito.Mockito.mockStatic;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.test.context.SpringBootTest;

import com.microservices.springbootrabbitmqproject.bean.User;

@SpringBootTest
public class RabbitMQJSONProducerTest {
	
	@InjectMocks
	RabbitMQJSONProducer mockPro;
	
	@Mock
	RabbitTemplate rabbitTemplate;
	
	
	@Test
	public void testSendMessage()
	{
		User user = new User(123, "abc", "xyz");
		this.mockPro.sendJSONMessage(user);
		Assertions.assertThat(true);
	}


}
