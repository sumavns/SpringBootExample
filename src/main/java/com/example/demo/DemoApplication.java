package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Employee;

@Configuration
@ComponentScan(basePackages = "com.example.demo")
@SpringBootApplication
public class DemoApplication {//implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

/*
 * public void run(String... args) throws Exception { RestTemplate restTemplate
 * = new RestTemplate(); Employee response =
 * restTemplate.postForObject("http://localhost:8081/employees/101",
 * Employee.class);
 * log.info("==== RESTful API Response using Spring RESTTemplate START ======="
 * ); log.info(response.toString());
 * log.info("==== RESTful API Response using Spring RESTTemplate END =======");
 * } }
 */
}