package com.javasampleapproach.rabbitmq.publisher;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Publisher {
	
	@Autowired
	private AmqpTemplate rabbitTemplate;
	
	
	@Value("${jgg.rabbitmq.exchange}")
	private String exchange;
	
	public void produceMsg(String msg){
		rabbitTemplate.convertAndSend(exchange, "test",msg);
		System.out.println("Send msg = " + msg);
	}
}