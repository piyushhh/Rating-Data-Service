package io.javabrains.RatingDataService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RatingDataServiceApplication {

	public static void main(String[] args) {
			
		SpringApplication.run(RatingDataServiceApplication.class, args);
		System.out.println("***************started RatingDataServiceApplication");
		System.out.println("*************************!!!!!!!!!");
	}
}