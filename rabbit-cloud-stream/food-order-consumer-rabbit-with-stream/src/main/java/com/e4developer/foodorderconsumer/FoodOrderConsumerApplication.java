package com.e4developer.foodorderconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.context.annotation.ComponentScan;

@EnableBinding(Sink.class)
@SpringBootApplication
@ComponentScan("com.e4developer.foodorderpublisher")
public class FoodOrderConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodOrderConsumerApplication.class, args);
	}

	@StreamListener(target = Sink.INPUT)
	public void processCheapMeals(String meal){
		System.out.println("This was a great meal!: "+meal);
		
		if (meal.contains("emp0003")) {
			throw new IllegalArgumentException("codigo invalido");
			
		}
		
		
	}
}
