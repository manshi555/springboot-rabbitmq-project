package com.microservices.springbootrabbitmqproject.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.microservices.springbootrabbitmqproject.bean.User;

@Service
public class RabbitMQJSONProducer {
	
	private static final Logger log = LoggerFactory.getLogger(RabbitMQJSONProducer.class);
	
	private RabbitTemplate rabbitTemplate;
	
	@Value("${rabbitmq.exchange.name}")
	private String exchange;
	
	@Value("${rabbitmq.jsonRoutingKey.name}")
	private String jsonRoutingKey;
	
	public RabbitMQJSONProducer(RabbitTemplate rabbitTemplate) {
		this.rabbitTemplate = rabbitTemplate;
	}


	public void sendJSONMessage(User user)
	{
		log.info("JSON Message sent  -> %s", user.toString());
		rabbitTemplate.convertAndSend(exchange, jsonRoutingKey, user);
	}

}
