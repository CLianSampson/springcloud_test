package com.cloud.clienttwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ClientTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientTwoApplication.class, args);
	}
}
