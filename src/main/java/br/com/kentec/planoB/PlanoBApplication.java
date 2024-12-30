package br.com.kentec.planoB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PlanoBApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlanoBApplication.class, args);
	}

}
