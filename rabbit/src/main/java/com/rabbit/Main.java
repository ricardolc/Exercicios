package com.rabbit;

import static springfox.documentation.builders.PathSelectors.regex;

//http://javainuse.com/spring/spring-boot-rabbitmq-hello-world
//http://local cde43443fvrb 6y7ujhñhost:8080/javainuse-rabbitmq/producer?empName=Ricardo Lopes&empId=emp001
//http://localhost:15672/
//https://www.youtube.com/watch?v=h8b1dXgPulQ



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2

//@ComponentScan({"com.rabbit"})

//@ComponentScan({"com.workflow.controller"})
//@EntityScan("com.workflow.model")
//@EnableJpaRepositories("com.workflow.repository")

public class Main {

//https://spring.io/guides/gs/spring-boot/
	
	public static void main(String[] args) {

		SpringApplication.run(
				new Object[] { Main.class }, args);
	}
	
    @Bean
    public Docket newsApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .paths(regex("/service.*"))
                .build();
    }
     
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Rabbit - Poc - Swagger")
                .description("Spring REST Sample with Swagger")
                .termsOfServiceUrl("http://www-03.ibm.com/software/sla/sladb.nsf/sla/bm?Open")
//                .contact("ContactName")
                .license("Apache License Version 2.0")
                .licenseUrl("https://github.com/IBM-Bluemix/news-aggregator/blob/master/LICENSE")
                .version("2.0")
                .build();
    }
	
	
}