package com.ibm.correlation;

import org.springframework.stereotype.Service;

@Service
public class CorrelationIdService {
    private static final ThreadLocal<String> correlationId = new ThreadLocal<>();
    public void setCorrelationId(String id) {
        correlationId.set(id);
    }
    public String getCorrelationId() {
        return correlationId.get();
    }
    public void clear() {
       correlationId.remove();
    }

}
