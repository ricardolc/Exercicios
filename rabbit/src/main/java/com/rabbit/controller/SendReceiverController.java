package com.rabbit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rabbit.model.Employee;
import com.rabbit.service.RabbitMQSendeReceiverService;

@RestController
@RequestMapping(value = "/service/")
public class SendReceiverController {

	@Autowired
	RabbitMQSendeReceiverService rabbitMQSenderReceiver;

	@GetMapping(value = "/producer")
	public String producer(@RequestParam("empName") String empName, @RequestParam("empId") String empId) {

		Employee employee = new Employee();

		employee.setEmpId(empId);
		employee.setEmpName(empName);

		rabbitMQSenderReceiver.send(employee);

		return (String.format("%s $s Sent",empId, empName))  ;
	}

	@RequestMapping("/receiver")
	public String receiverMsg() {
		String ret = rabbitMQSenderReceiver.receive().toString();
		System.out.println("retorno: " + ret);
		return "Done" + ret.toString();
	}

}
