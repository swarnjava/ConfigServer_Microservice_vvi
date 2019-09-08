package com.swarn.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
@EnableAutoConfiguration
public class EurekaRegistry {

	public static void main(String[] args)
	{
		SpringApplication.run(EurekaRegistry.class, args);
	}
}
