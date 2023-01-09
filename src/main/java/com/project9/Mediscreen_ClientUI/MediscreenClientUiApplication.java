package com.project9.Mediscreen_ClientUI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients("com.project9.Mediscreen_ClientUI")
@SpringBootApplication
public class MediscreenClientUiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MediscreenClientUiApplication.class, args);
	}

}
