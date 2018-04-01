package com.javainuse.controller;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.javainuse.model.Employee;

@Service
public class RabbitMQConsumer {
	
//@RabbitListener(queues="${javainuse.rabbitmq.queue}")
    public String recievedMessage(Employee emp) {
        System.out.println("Recieved Message: " + emp.getEmpName());
        return "";
    }

}
