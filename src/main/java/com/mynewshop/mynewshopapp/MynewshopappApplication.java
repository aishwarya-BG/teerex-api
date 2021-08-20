package com.mynewshop.mynewshopapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.mynewshop.mynewshopapp.repository")
@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})
public class MynewshopappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MynewshopappApplication.class, args);
	}

}
