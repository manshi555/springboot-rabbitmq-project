package com.microservices.springbootrabbitmqproject.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.microservices.springbootrabbitmqproject.bean.User;

@Service
public class RabbitMQConsumer {

	
	public static final Logger log= LoggerFactory.getLogger(RabbitMQConsumer.class);
	
	@RabbitListener(queues = {"${rabbitmq.queue.name}"})
	public void consumer(String message)
	{
		log.info(String.format("Received message -> %s", message));
	}
	
	@RabbitListener(queues = {"${rabbitmq.jsonQueue.name}"})
	public void jsonConsumer(User user)
	{
		log.info(String.format("Received JSON message -> %s", user.toString()));
	}
}
