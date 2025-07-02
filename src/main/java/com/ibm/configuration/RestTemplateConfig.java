package com.ibm.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Configuration class for creating a RestTemplate bean.
 * 
 * This class defines a configuration for Spring's dependency injection to create and manage 
 * a RestTemplate bean, which is used to make HTTP requests and interact with RESTful web services.
 */
@Configuration
public class RestTemplateConfig {

/**
 * Creates and configures a RestTemplate bean.
 * 
 * This method initializes a new instance of RestTemplate and registers it as a Spring bean.
 * RestTemplate is a synchronous client to perform HTTP requests, exposing a simple, 
 * template method API over underlying HTTP client libraries.
 *
 * @return a configured instance of RestTemplate
 */
@Bean
public RestTemplate restTemplate() {
    return new RestTemplate();
}

}
