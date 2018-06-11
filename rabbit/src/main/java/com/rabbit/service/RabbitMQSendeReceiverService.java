package com.rabbit.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.rabbit.model.Employee;

@Service
public class RabbitMQSendeReceiverService {
	
	
	
	@Autowired
	private AmqpTemplate amqpTemplate;
	
	@Value("${javainuse.rabbitmq.exchange}")
	private String exchange;
	
	@Value("${javainuse.rabbitmq.routingkey}")
	private String routingkey;	
	
	final private String QUEUE_NAME = "javainuse.queue";
	
	public void send(Employee company) {
		amqpTemplate.convertAndSend(exchange, routingkey, company);
	}
	
	public Object receive() {
		return amqpTemplate.receiveAndConvert(QUEUE_NAME, 3000);    
	}	
	
	
	public void send(String str) {
		amqpTemplate.convertAndSend(exchange, routingkey, str);
		System.out.println("Send msg = " + str);
	    
	}
	
	
	
}