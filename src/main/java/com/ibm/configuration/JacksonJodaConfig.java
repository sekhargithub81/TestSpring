package com.ibm.configuration;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JacksonJodaConfig {

    @Bean
    public Module jodaTimeModule() {
        return new JodaModule();
    }
}
