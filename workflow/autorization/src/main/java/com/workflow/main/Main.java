package com.workflow.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.workflow.repository","com.workflow.controller"})
//@ComponentScan("com.workflow.controller")
public class Main {

	public static void main(String[] args) {
		System.getProperties().put( "server.port", 8182 );  //8181 port is set here
		SpringApplication.run(Main.class, args);
	}
}
