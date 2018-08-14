package com.e4developer.foodorderpublisher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

//@EnableBinding(Sink.class)
@EnableBinding(CustomerSource.class)
@EnableAutoConfiguration
public class ClientConsumer {

	//@StreamListener(target = Sink.INPUT)
	@StreamListener("customerChannel")
	public void processCustomer(String customer) throws Exception{
		System.out.println("ClientConsumer !: "+customer);
		

		
		
	}
}
