package com.client2.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableDiscoveryClient
//@EnableAutoConfiguration
@ComponentScan("com.client2")
public class SpringConfigClientApplication2 {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigClientApplication2.class, args);
	}
}
