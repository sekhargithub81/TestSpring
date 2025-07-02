package com.ibm.api;

import com.ibm.model.InitiatePaymentExecutionProcedureRequest;
import com.ibm.model.InitiatePaymentExecutionProcedureResponse;
import com.ibm.model.RetrievePaymentExecutionProcedureResponse;
import com.ibm.model.UpdatePaymentExecutionProcedureRequest;
import com.ibm.model.UpdatePaymentExecutionProcedureResponse;
import io.swagger.annotations.*;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import com.ibm.services.CrPaymentExecutionProcedureApiServiceI;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class CrPaymentExecutionProcedureApiController implements CrPaymentExecutionProcedureApi {

	@Autowired
	CrPaymentExecutionProcedureApiServiceI crPaymentExecutionProcedureApiServiceI;


private static final Logger logger = LoggerFactory.getLogger(CrPaymentExecutionProcedureApiController.class);

/**
 * This controller method handles a GET request to initiate.
 * InCR Initiate a payment execution procedure based on following parameters
 * @param initiatePaymentExecutionProcedureRequest.
 * @return A ResponseEntity containing the InitiatePaymentExecutionProcedureResponse and HTTP status.
 */
public ResponseEntity<InitiatePaymentExecutionProcedureResponse> initiate(@Parameter(name = "InitiatePaymentExecutionProcedureRequest", description = "", required = true) @Valid @RequestBody InitiatePaymentExecutionProcedureRequest initiatePaymentExecutionProcedureRequest){
        logger.debug("Entering method initiate with param: ",initiatePaymentExecutionProcedureRequest);
        InitiatePaymentExecutionProcedureResponse res  = crPaymentExecutionProcedureApiServiceI.initiate(initiatePaymentExecutionProcedureRequest);
        logger.debug("Exiting method initiate with response: ", res);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
    

/**
 * This controller method handles a GET request to retrieve.
 * ReCR Retrieve details about a payment execution instruction based on following parameters
 * @param paymentexecutionid.
 * @return A ResponseEntity containing the RetrievePaymentExecutionProcedureResponse and HTTP status.
 */
public ResponseEntity<RetrievePaymentExecutionProcedureResponse> retrieve(@Parameter(name = "paymentexecutionid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("paymentexecutionid") String paymentexecutionid){
        logger.debug("Entering method retrieve with param: ",paymentexecutionid);
        RetrievePaymentExecutionProcedureResponse res  = crPaymentExecutionProcedureApiServiceI.retrieve(paymentexecutionid);
        logger.debug("Exiting method retrieve with response: ", res);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
    

/**
 * This controller method handles a GET request to update.
 * UpCR Update details of a payment execution instruction based on following parameters
 * @param paymentexecutionid.
 * @param updatePaymentExecutionProcedureRequest.
 * @return A ResponseEntity containing the UpdatePaymentExecutionProcedureResponse and HTTP status.
 */
public ResponseEntity<UpdatePaymentExecutionProcedureResponse> update(@Parameter(name = "paymentexecutionid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("paymentexecutionid") String paymentexecutionid,@Parameter(name = "UpdatePaymentExecutionProcedureRequest", description = "", required = true) @Valid @RequestBody UpdatePaymentExecutionProcedureRequest updatePaymentExecutionProcedureRequest){
        logger.debug("Entering method update with param: ",paymentexecutionid,updatePaymentExecutionProcedureRequest);
        UpdatePaymentExecutionProcedureResponse res  = crPaymentExecutionProcedureApiServiceI.update(paymentexecutionid,updatePaymentExecutionProcedureRequest);
        logger.debug("Exiting method update with response: ", res);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
    

}
