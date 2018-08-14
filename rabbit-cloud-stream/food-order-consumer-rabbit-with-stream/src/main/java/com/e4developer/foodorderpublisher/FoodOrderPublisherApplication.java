package com.e4developer.foodorderpublisher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
@SpringBootApplication
public class FoodOrderPublisherApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodOrderPublisherApplication.class, args);
	}
	
	
	@StreamListener(target = Sink.INPUT)
	public void processCheapMeals(String meal){
		System.out.println("This was a great meal!: "+meal);
		
		if (meal.contains("emp0003")) {
			throw new IllegalArgumentException("codigo invalido");
			
		}
		
		
	}
}
