package com.gitee.easyopen.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = {"com.gitee.easyopen.server.service"})
@EnableDiscoveryClient
@SpringBootApplication
public class EmptySpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmptySpringbootApplication.class, args);
	}
}
