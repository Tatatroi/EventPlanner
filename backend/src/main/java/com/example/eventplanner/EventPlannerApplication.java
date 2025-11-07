package com.example.eventplanner;

import jakarta.persistence.Entity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.example.eventplanner.model")
public class EventPlannerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventPlannerApplication.class, args);
	}

}
