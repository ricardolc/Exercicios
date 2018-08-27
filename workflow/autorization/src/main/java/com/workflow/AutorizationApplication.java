package com.workflow;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//http://www.ciceroednilson.com.br/desenvolvendo-uma-aplicacao-web-com-angular-4-e-spring-boot-parte-2-criando-o-banco-de-dados/
//http://www.thejavageek.com/2017/06/16/crud-application-using-angular-4-spring-rest-web-services-spring-data-jpa/
//@ComponentScan({"com.workflow.controller", "com.workflow.service"})
//@EntityScan("com.workflow.model")
//@EnableJpaRepositories("com.workflow.repository")

//@EnableJpaRepositories("com.workflow.repository")
//@EntityScan("com.workflow.model")

@SpringBootApplication
@EnableAutoConfiguration
@EnableSwagger2
@ComponentScan
//@EnableJpaRepositories
//@EntityScan
public class AutorizationApplication { // extends SpringBootServletInitializer {
	
	//@Override
	//protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	//	return application.sources(autorizationApplication.class);
	//}


	public static void main(String[] args) {
		System.getProperties().put( "server.port", 8090 );  //8181 port is set here
		SpringApplication.run(AutorizationApplication.class, args);
	}
	

    @Bean
    public Docket newsApi() {
        return new Docket(DocumentationType.SWAGGER_2)
//                .groupName("greetings")
                .apiInfo(apiInfo())
                .select()
                .paths(regex("/service.*"))
                .build();
    }
     
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("WorkFlow - Documentação Swagger")
                .description("Spring REST Sample with Swagger")
                .termsOfServiceUrl("http://www-03.ibm.com/software/sla/sladb.nsf/sla/bm?Open")
                .contact("Niklas Heidloff")
                .license("Apache License Version 2.0")
                .licenseUrl("https://github.com/IBM-Bluemix/news-aggregator/blob/master/LICENSE")
                .version("2.0")
                .build();
    }
	



}