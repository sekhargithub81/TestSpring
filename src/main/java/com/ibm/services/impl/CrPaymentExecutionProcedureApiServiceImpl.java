package com.ibm.services.impl;

import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ibm.model.InitiatePaymentExecutionProcedureRequest;
import com.ibm.model.InitiatePaymentExecutionProcedureResponse;
import com.ibm.model.UpdatePaymentExecutionProcedureResponse;
import com.ibm.model.UpdatePaymentExecutionProcedureRequest;
import com.ibm.model.RetrievePaymentExecutionProcedureResponse;
import com.ibm.services.CrPaymentExecutionProcedureApiServiceI;

/**
 * Service implementation for handling operations related to CrPaymentExecutionProcedureApiService.
 */
@Service
public class CrPaymentExecutionProcedureApiServiceImpl implements CrPaymentExecutionProcedureApiServiceI {

private static final Logger logger = LoggerFactory.getLogger(CrPaymentExecutionProcedureApiServiceImpl.class);

/**
* This implementation method includes details about the initiate.
* @param initiatePaymentExecutionProcedureRequest.
* @return The response containing details of the initiate.
*/
@Override
public InitiatePaymentExecutionProcedureResponse initiate(InitiatePaymentExecutionProcedureRequest initiatePaymentExecutionProcedureRequest) {
	logger.debug("Starting method initiate with param: ",initiatePaymentExecutionProcedureRequest);
    //TODO: Implement Business logic
    logger.debug("Completed method initiate");
    return null;
}

/**
* This implementation method includes details about the update.
* @param paymentexecutionid.
* @param updatePaymentExecutionProcedureRequest.
* @return The response containing details of the update.
*/
@Override
public UpdatePaymentExecutionProcedureResponse update(String paymentexecutionid,UpdatePaymentExecutionProcedureRequest updatePaymentExecutionProcedureRequest) {
	logger.debug("Starting method update with param: ",paymentexecutionid,updatePaymentExecutionProcedureRequest);
    //TODO: Implement Business logic
    logger.debug("Completed method update");
    return null;
}

/**
* This implementation method includes details about the retrieve.
* @param paymentexecutionid.
* @return The response containing details of the retrieve.
*/
@Override
public RetrievePaymentExecutionProcedureResponse retrieve(String paymentexecutionid) {
	logger.debug("Starting method retrieve with param: ",paymentexecutionid);
    //TODO: Implement Business logic
    logger.debug("Completed method retrieve");
    return null;
}


}
