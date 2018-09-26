package com.cloudconfig.configclienttest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigclienttestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigclienttestApplication.class, args);
	}
}
