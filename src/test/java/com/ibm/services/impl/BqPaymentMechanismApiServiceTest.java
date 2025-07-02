package com.ibm.services.impl;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import com.ibm.model.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
@AutoConfigureMockMvc(addFilters = false)
@WebMvcTest(BqPaymentMechanismApiServiceTest.class)
public class BqPaymentMechanismApiServiceTest {

    @Autowired
    private MockMvc mvc;
    
    @MockBean
    private BqPaymentMechanismApiServiceImpl bqPaymentMechanismApiService;
    

    @Test
    public void testretrievePaymentMechanism() throws Exception {
	
        HttpHeaders httpHeaders = getHeaders();
       
mvc.perform(MockMvcRequestBuilders.get("/PaymentExecution/{paymentexecutionid}/PaymentMechanism/{paymentmechanismid}/Retrieve",1,1)                 .headers(httpHeaders).param("paymentexecutionid", "text").param("paymentmechanismid", "text")
                 .accept(MediaType.APPLICATION_JSON)
                 ).andExpect(status().isOk());
       }
       
    public HttpHeaders getHeaders() throws Exception {

    ObjectMapper objectMapper = new ObjectMapper();
    Map<String, String> myMap = new HashMap<String, String>();
    ClassLoader classLoader = this.getClass().getClassLoader();
    File file = new File(classLoader.getResource("header.json").getFile());
    byte[] mapData = Files.readAllBytes(Paths.get(file.getAbsolutePath()));
    myMap = objectMapper.readValue(mapData, HashMap.class);

    HttpHeaders httpHeaders = new HttpHeaders();
    myMap.entrySet().stream().forEach(entry -> {
    httpHeaders.add(entry.getKey(), entry.getValue());
    });
    return httpHeaders;
    }
}
