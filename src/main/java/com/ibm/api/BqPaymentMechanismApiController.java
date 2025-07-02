package com.ibm.api;

import com.ibm.model.RetrievePaymentMechanismResponse;
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
import com.ibm.services.BqPaymentMechanismApiServiceI;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class BqPaymentMechanismApiController implements BqPaymentMechanismApi {

	@Autowired
	BqPaymentMechanismApiServiceI bqPaymentMechanismApiServiceI;


private static final Logger logger = LoggerFactory.getLogger(BqPaymentMechanismApiController.class);

/**
 * This controller method handles a GET request to retrievePaymentMechanism.
 * ReBQ Retrieve details about the payment mechanism selection based on following parameters
 * @param paymentexecutionid.
 * @param paymentmechanismid.
 * @return A ResponseEntity containing the RetrievePaymentMechanismResponse and HTTP status.
 */
public ResponseEntity<RetrievePaymentMechanismResponse> retrievePaymentMechanism(@Parameter(name = "paymentexecutionid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("paymentexecutionid") String paymentexecutionid,@Parameter(name = "paymentmechanismid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("paymentmechanismid") String paymentmechanismid){
        logger.debug("Entering method retrievePaymentMechanism with param: ",paymentexecutionid,paymentmechanismid);
        RetrievePaymentMechanismResponse res  = bqPaymentMechanismApiServiceI.retrievePaymentMechanism(paymentexecutionid,paymentmechanismid);
        logger.debug("Exiting method retrievePaymentMechanism with response: ", res);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
    

}
