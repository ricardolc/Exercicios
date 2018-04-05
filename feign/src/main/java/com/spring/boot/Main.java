package com.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableFeignClients
public class Main {

	
	public static void main(String[] args) {

		SpringApplication.run(
				new Object[] { Main.class }, args);
	}
}