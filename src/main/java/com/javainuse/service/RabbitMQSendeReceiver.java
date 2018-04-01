package com.javainuse.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.javainuse.model.Employee;

@Service
public class RabbitMQSendeReceiver {
	
	@Autowired
	private AmqpTemplate amqpTemplate;
	
	@Value("${javainuse.rabbitmq.exchange}")
	private String exchange;
	
	@Value("${javainuse.rabbitmq.routingkey}")
	private String routingkey;	
	String kafkaTopic = "java_in_use_topic";
	
	public void send(Employee company) {
		amqpTemplate.convertAndSend(exchange, routingkey, company);
		
		System.out.println("Send msg = " + company);
	    
	}
	
	public String receive() {
		Object ret = amqpTemplate.receiveAndConvert("javainuse.queue", 3000).toString();
	    
		return ret.toString();
	}	
	
	
	public void send(String str) {
		amqpTemplate.convertAndSend(exchange, routingkey, str);
		System.out.println("Send msg = " + str);
	    
	}
	
}