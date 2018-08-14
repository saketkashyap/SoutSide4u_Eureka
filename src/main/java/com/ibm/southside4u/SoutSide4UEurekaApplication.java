package com.ibm.southside4u;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SoutSide4UEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoutSide4UEurekaApplication.class, args);
	}
}
