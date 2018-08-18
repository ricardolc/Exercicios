package com.e4developer.foodorderpublisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(CustomerSource.class)
@EnableAutoConfiguration
public class CustomerConsumer {

	@Autowired
	CustomerService customerService;
	
	@StreamListener("customerChannelInput")
	public void processCustomer(String customer) throws Exception{
		System.out.println("ClientConsumer !: "+customer);
 
		customerService.sendMessaCustomer();

		
		
	}
}
