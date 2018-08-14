package com.e4developer.foodorderpublisher;

import java.util.concurrent.TimeUnit;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

//@EnableBinding(Sink.class)
@EnableBinding(FoodOrderSource.class)
@EnableAutoConfiguration
public class FoodOrderConsumer {

	
	//@Autowired
	//CustomerService customerService;
	
	//@StreamListener(target = Sink.INPUT)
	
	@StreamListener("foodOrdersChannel")
	public void processCheapMeals(String meal) throws Exception{
	//	TimeUnit.SECONDS.sleep(1);
		System.out.println("FoodOrderConsumer: "+meal);
		
		if (meal.contains("emp0003")) {
			throw new Exception("codigo invalido");
			
		}
		
		//customerService.sendMessaCustomer();
		
		
	}
}
