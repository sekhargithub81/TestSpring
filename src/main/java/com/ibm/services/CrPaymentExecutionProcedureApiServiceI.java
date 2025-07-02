package com.ibm.services;

import com.ibm.model.InitiatePaymentExecutionProcedureRequest;
import com.ibm.model.InitiatePaymentExecutionProcedureResponse;
import com.ibm.model.UpdatePaymentExecutionProcedureResponse;
import com.ibm.model.UpdatePaymentExecutionProcedureRequest;
import com.ibm.model.RetrievePaymentExecutionProcedureResponse;

/**
 * Service interface for handling operations related to CrPaymentExecutionProcedureApiService.
 */
public interface CrPaymentExecutionProcedureApiServiceI {

	/**
     * This method includes details about the initiate.
     * @param initiatePaymentExecutionProcedureRequest.
     * @return The response containing details of the initiate.
     */
    InitiatePaymentExecutionProcedureResponse initiate(InitiatePaymentExecutionProcedureRequest initiatePaymentExecutionProcedureRequest);

	/**
     * This method includes details about the update.
     * @param paymentexecutionid.
     * @param updatePaymentExecutionProcedureRequest.
     * @return The response containing details of the update.
     */
    UpdatePaymentExecutionProcedureResponse update(String paymentexecutionid,UpdatePaymentExecutionProcedureRequest updatePaymentExecutionProcedureRequest);

	/**
     * This method includes details about the retrieve.
     * @param paymentexecutionid.
     * @return The response containing details of the retrieve.
     */
    RetrievePaymentExecutionProcedureResponse retrieve(String paymentexecutionid);


}
