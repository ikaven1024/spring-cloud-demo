package com.example.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProducerApplication.class, args);
	}

	@Value("${spring.profiles.active}")
	private String name;

	@RequestMapping("")
	public String home() {
		return "Hi, i'm " + name;
	}

	@RequestMapping("/trouble")
	public String trouble() throws InterruptedException {
		Thread.sleep(10000);
		throw  new RuntimeException("troubled");
	}
}
