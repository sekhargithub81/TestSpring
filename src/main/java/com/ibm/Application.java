package com.ibm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Main application class for starting the Spring Boot application.
 */
@SpringBootApplication
@ComponentScan(basePackages = { "com.ibm.*"})
public class Application {
/**
 * Main method to launch the Spring Boot application.
 * @param args Command line arguments passed to the application.
 */
	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
	}
	
}
