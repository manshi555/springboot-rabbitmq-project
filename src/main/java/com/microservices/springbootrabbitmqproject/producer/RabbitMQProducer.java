package com.microservices.springbootrabbitmqproject.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQProducer {
	
	private static final Logger log = LoggerFactory.getLogger(RabbitMQProducer.class);
	
	@Value("${rabbitmq.exchange.name}")
	private String exchange;
	
	@Value("${rabbitmq.routingKey.name}")
	private String routingKey;

	private RabbitTemplate rabbitTemplate;

	public RabbitMQProducer(RabbitTemplate rabbitTemplate) {
		this.rabbitTemplate = rabbitTemplate;
	}
	
	public void sendMessage(String message)
	{
		log.info(String.format("Message sent -> %s", message));
		rabbitTemplate.convertAndSend(exchange, routingKey, message);
	}

}
