package com.e4developer.foodorderpublisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    public FoodOrderSource foodOrderSource;
	
	
//	public Client client;
	
	
	
	public void sendMessaCustomer() {
//		client = new Client("111", "2222");
	
		
		
		String json = "{ 'restaurant':'Paris 622', 'customerAddress' : 'emp0004', 'orderDescription' : 'true' }";
		foodOrderSource.foodOrdersInput().send(MessageBuilder.withPayload(json).build());
		
		
	}
	
	
}
