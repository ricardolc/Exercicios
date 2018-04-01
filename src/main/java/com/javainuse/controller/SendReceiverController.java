package com.javainuse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.model.Employee;
import com.javainuse.service.RabbitMQSendeReceiver;

@RestController
@RequestMapping(value = "/javainuse-rabbitmq/")
public class SendReceiverController {

	@Autowired
	RabbitMQSendeReceiver rabbitMQSenderReceiver;

	@GetMapping(value = "/producer")
	public String producer(@RequestParam("empName") String empName,@RequestParam("empId") String empId) {
	
	Employee emp=new Employee();
	emp.setEmpId(empId);
	emp.setEmpName(empName);
	   rabbitMQSenderReceiver.send(emp);

		return "Message sent to the RabbitMQ JavaInUse Successfully";
	}
	
	
	@RequestMapping("/receiver")
	public String receiverMsg(){
	   String ret = rabbitMQSenderReceiver.receive();
	   System.out.println("retorno: " + ret);
 		return "Done" + ret.toString();
	}
	

	

}

