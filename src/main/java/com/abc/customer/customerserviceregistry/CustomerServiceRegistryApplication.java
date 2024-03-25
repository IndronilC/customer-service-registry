package com.abc.customer.customerserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CustomerServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceRegistryApplication.class, args);
	}

}
