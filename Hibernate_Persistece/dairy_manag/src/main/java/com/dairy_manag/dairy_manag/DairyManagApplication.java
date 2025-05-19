package com.dairy_manag.dairy_manag;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})

public class DairyManagApplication {

	public static void main(String[] args) {
		SpringApplication.run(DairyManagApplication.class, args);
		System.out.println("Hello Dhananjay:");
	}

}
