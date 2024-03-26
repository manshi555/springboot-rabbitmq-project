package com.microservices.springbootrabbitmqproject.producer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RabbitMQProducerTest {
	
	@InjectMocks
	RabbitMQProducer mockPro;
	
	@Mock
	RabbitTemplate rabbitTemplate;
	
	@Test
	public void testSendMessage()
	{
		this.mockPro.sendMessage("abc");
		Assertions.assertThat(true);
	}

}
