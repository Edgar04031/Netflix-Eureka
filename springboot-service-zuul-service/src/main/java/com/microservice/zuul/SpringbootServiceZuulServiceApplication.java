package com.microservice.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class SpringbootServiceZuulServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServiceZuulServiceApplication.class, args);
	}

}