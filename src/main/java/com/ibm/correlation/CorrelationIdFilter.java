package com.ibm.correlation;

import java.io.IOException;
import java.util.UUID;

import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;


import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



/**
 * 
 */
@Component
public class CorrelationIdFilter extends OncePerRequestFilter {

	@Autowired
	private CorrelationIdService correlationIdService;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		// Get the correlation ID from the request header
		String correlationId = request.getHeader("X-Correlation-ID");
		if (correlationId == null) {
			correlationId = request.getHeader("X-Request-ID");
		}

		// If not present, generate a new one
		if (correlationId == null) {
			correlationId = UUID.randomUUID().toString();
		}

		// Set the correlation ID in the service
		correlationIdService.setCorrelationId(correlationId);

		// Store the correlation ID in MDC for logging
		MDC.put("correlationId", correlationId);

		// Add the correlation ID to the response headers
		response.setHeader("X-Correlation-ID", correlationId);

		try {
			filterChain.doFilter(request, response);
		} finally {
			// Clean up
			MDC.remove("correlationId");
			correlationIdService.clear();
		}
	}
}
