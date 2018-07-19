package com.javainuse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.model.Employee;
import com.javainuse.source.EmployeeRegistrationSource;

@RestController
@EnableBinding(EmployeeRegistrationSource.class)
public class EmployeeRegistrationController {

	@Autowired
	EmployeeRegistrationSource employeeRegistrationSource;

	@RequestMapping("/register")
	@ResponseBody
	public String orderFood(@RequestBody Employee employee) {
		boolean sended;
		sended = employeeRegistrationSource.employeeRegistration().send(MessageBuilder.withPayload("aaa").build());
		System.out.println(employee.toString());
		return "Employee Registered";
	}
}
