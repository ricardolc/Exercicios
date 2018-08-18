package com.e4developer.foodorderpublisher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
@SpringBootApplication
public class FoodOrderConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodOrderConsumerApplication.class, args);
	}
}
