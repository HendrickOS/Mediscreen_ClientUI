package com.project9.Mediscreen_ClientUI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableFeignClients("com.project9.Mediscreen_ClientUI")
@SpringBootApplication
@EnableSwagger2
@EnableDiscoveryClient
public class MediscreenClientUiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MediscreenClientUiApplication.class, args);
	}

}
