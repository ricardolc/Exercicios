package com.rabbit.controller;

//import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.rabbit.model.Employee;

@Service
public class RabbitMQConsumer {
	
//@RabbitListener(queues="${javainuse.rabbitmq.queue}")
    public String recievedMessage(Employee emp) {
        System.out.println("Recieved Message: " + emp.getEmpName());
        return "";
    }

}
