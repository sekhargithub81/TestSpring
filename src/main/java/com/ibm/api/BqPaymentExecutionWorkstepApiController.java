package com.ibm.api;

import com.ibm.model.RetrievePaymentExecutionWorkstepResponse;
import io.swagger.annotations.*;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.constraints.*;
import com.ibm.services.BqPaymentExecutionWorkstepApiServiceI;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class BqPaymentExecutionWorkstepApiController implements BqPaymentExecutionWorkstepApi {

	@Autowired
	BqPaymentExecutionWorkstepApiServiceI bqPaymentExecutionWorkstepApiServiceI;


private static final Logger logger = LoggerFactory.getLogger(BqPaymentExecutionWorkstepApiController.class);

/**
 * This controller method handles a GET request to retrievePaymentExecutionWorkstep.
 * ReBQ Retrieve details about the gateway transaction based on following parameters
 * @param paymentexecutionid.
 * @param paymentexecutionworkstepid.
 * @return A ResponseEntity containing the RetrievePaymentExecutionWorkstepResponse and HTTP status.
 */
public ResponseEntity<RetrievePaymentExecutionWorkstepResponse> retrievePaymentExecutionWorkstep(@Parameter(name = "paymentexecutionid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("paymentexecutionid") String paymentexecutionid,@Parameter(name = "paymentexecutionworkstepid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("paymentexecutionworkstepid") String paymentexecutionworkstepid){
        logger.debug("Entering method retrievePaymentExecutionWorkstep with param: ",paymentexecutionid,paymentexecutionworkstepid);
        RetrievePaymentExecutionWorkstepResponse res  = bqPaymentExecutionWorkstepApiServiceI.retrievePaymentExecutionWorkstep(paymentexecutionid,paymentexecutionworkstepid);
        logger.debug("Exiting method retrievePaymentExecutionWorkstep with response: ", res);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
    

}
