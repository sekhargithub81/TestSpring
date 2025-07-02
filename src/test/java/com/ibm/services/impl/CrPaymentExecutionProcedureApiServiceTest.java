package com.ibm.services.impl;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import com.ibm.model.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import com.fasterxml.jackson.databind.SerializationFeature;

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

import io.github.benas.randombeans.api.EnhancedRandom;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
@AutoConfigureMockMvc(addFilters = false)
@WebMvcTest(CrPaymentExecutionProcedureApiServiceTest.class)
public class CrPaymentExecutionProcedureApiServiceTest {

    @Autowired
    private MockMvc mvc;
    
    @MockBean
    private CrPaymentExecutionProcedureApiServiceImpl crPaymentExecutionProcedureApiService;
    

    @Test
    public void testinitiate() throws Exception {
	
        InitiatePaymentExecutionProcedureRequest initiatePaymentExecutionProcedureRequest = EnhancedRandom.random(InitiatePaymentExecutionProcedureRequest.class);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JodaModule());
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        ObjectWriter ow = objectMapper.writer().withDefaultPrettyPrinter();
        String requestJson = ow.writeValueAsString(initiatePaymentExecutionProcedureRequest); 
        HttpHeaders httpHeaders = getHeaders();
       
              
        mvc.perform(MockMvcRequestBuilders.post("/PaymentExecution/Initiate")
                 .headers(httpHeaders)
                 .accept(MediaType.APPLICATION_JSON).contentType("application/json")
                 .content(requestJson)).andExpect(status().isOk());
       }
    @Test
    public void testupdate() throws Exception {
	
        UpdatePaymentExecutionProcedureRequest updatePaymentExecutionProcedureRequest = EnhancedRandom.random(UpdatePaymentExecutionProcedureRequest.class);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JodaModule());
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        ObjectWriter ow = objectMapper.writer().withDefaultPrettyPrinter();
        String requestJson = ow.writeValueAsString(updatePaymentExecutionProcedureRequest); 
        HttpHeaders httpHeaders = getHeaders();
       
        mvc.perform(MockMvcRequestBuilders.put("/PaymentExecution/{paymentexecutionid}/Update",1)       
       
                 .headers(httpHeaders).param("paymentexecutionid", "text")
                 .accept(MediaType.APPLICATION_JSON).contentType("application/json")
                 .content(requestJson)).andExpect(status().isOk());
       }
    @Test
    public void testretrieve() throws Exception {
	
        HttpHeaders httpHeaders = getHeaders();
       
        mvc.perform(MockMvcRequestBuilders.get("/PaymentExecution/{paymentexecutionid}/Retrieve",1)       
       
                 .headers(httpHeaders).param("paymentexecutionid", "text")
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
