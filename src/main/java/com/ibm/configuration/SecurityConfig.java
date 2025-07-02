/**
 * 
 */
package com.ibm.configuration;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

/**
 * 
 */

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Value("${spring.security.oauth2.resource.token-info-uri}")
    String introspectionUri;

    @Value("${spring.security.oauth2.client.clientId}")
    String clientId;

    @Value("${spring.security.oauth2.client.clientSecret}")
    String clientSecret;
	
    @Bean
    CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.addAllowedOriginPattern("*");
        configuration.setAllowedMethods(Arrays.asList(
                HttpMethod.GET.name(),
                HttpMethod.OPTIONS.name(),
                HttpMethod.POST.name(),
                HttpMethod.PUT.name(),
                HttpMethod.DELETE.name()));
        configuration.setAllowCredentials(true);
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }

    @Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.csrf(csrf -> {
            csrf.disable();
        }).cors(cors -> cors.configurationSource(corsConfigurationSource()))
		.authorizeHttpRequests(authz -> authz
                .requestMatchers("/v3/api-docs/swagger*/**", "/v3/api-docs", "/v2/api-docs", "/configuration/**", "/swagger*/**", "/swagger-ui/**", "/webjars/**", "/actuator", "/actuator/**", "/health", "/refreshResources", "/ports", "/run-websocket/**").permitAll()
					.requestMatchers("/Initiate").hasRole("user")
					.requestMatchers("/Update").hasRole("user")
					.requestMatchers("/Retrieve").hasRole("user")
					.requestMatchers("/RetrievePaymentMechanism").hasRole("user")
					.requestMatchers("/RetrievePaymentExecutionWorkstep").hasRole("user")
)
        .oauth2ResourceServer(oauth2 -> {
            oauth2.opaqueToken
            (token -> token.introspectionUri(this.introspectionUri)
                    .introspectionClientCredentials(this.clientId, this.clientSecret));
        });
		return http.build();

	}
}
