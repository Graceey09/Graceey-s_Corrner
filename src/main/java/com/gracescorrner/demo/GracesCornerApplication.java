package com.gracescorrner.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class GracesCornerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GracesCornerApplication.class, args);
	}

}
