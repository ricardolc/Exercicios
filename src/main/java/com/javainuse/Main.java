package com.javainuse;

//http://javainuse.com/spring/spring-boot-rabbitmq-hello-world
//http://local cde43443fvrb 6y7ujhñhost:8080/javainuse-rabbitmq/producer?empName=Ricardo Lopes&empId=emp001
//http://localhost:15672/
//https://www.youtube.com/watch?v=h8b1dXgPulQ



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {

		SpringApplication.run(
				new Object[] { Main.class }, args);
	}
}