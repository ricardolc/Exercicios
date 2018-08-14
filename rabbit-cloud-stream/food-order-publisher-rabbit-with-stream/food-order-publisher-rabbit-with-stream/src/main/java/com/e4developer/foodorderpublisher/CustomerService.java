package com.e4developer.foodorderpublisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Service;

//@Service
public class CustomerService {

//	@Autowired
//	public CustomerSource customerSource;
	
	
//	public Client client;
	
	
	
	public void sendMessaCustomer() {
//		client = new Client("111", "2222");
	
		
		
		String json = "{ 'cpf' : '111', 'nome' : 'ricardo' }";
//		customerSource.customerOrder().send(MessageBuilder.withPayload(client).build());
		
		
	}
	
	
}
