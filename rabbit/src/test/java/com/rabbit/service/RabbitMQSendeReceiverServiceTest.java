package com.rabbit.service;


//import static org.hamcrest.Matchers.equalTo;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.rabbit.model.Employee;
import com.rabbit.service.RabbitMQSendeReceiverService;

import junit.framework.Assert;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc

public class RabbitMQSendeReceiverServiceTest {
	
	@Autowired
	private RabbitMQSendeReceiverService rabbitSR;
	
	@Autowired
	Employee employee;
	
	@Value("${javainuse.rabbitmq.exchange}")
	private String exchange;
	
	@Value("${javainuse.rabbitmq.routingkey}")
	private String routingkey;	
	
    
    @Test
    public void shouldBeRabbitSendAndReceiveMessage() throws Exception{
    	
		employee.setEmpId("124");
		employee.setEmpName("Test1");

		rabbitSR.send(employee);

		employee.setEmpId("122");
		employee.setEmpName("Test2");

		rabbitSR.send(employee);
		
		String content = rabbitSR.receive().toString();
		content = rabbitSR.receive().toString();
		
		Assert.assertTrue(content.length() == 0);
		
    }
 
	

}
