package com.e4developer.foodorderpublisher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//https://github.com/spring-cloud/spring-cloud-stream-samples/blob/master/multibinder-samples/multibinder-kafka-rabbit/src/main/java/multibinder/BridgeTransformer.java
@SpringBootApplication
@EnableAutoConfiguration
public class FoodOrderPublisherApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodOrderPublisherApplication.class, args);
	}
}
