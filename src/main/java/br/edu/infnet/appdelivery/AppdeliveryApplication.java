package br.edu.infnet.appdelivery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppdeliveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppdeliveryApplication.class, args);
	}

}
