package com.ibm.services;

import com.ibm.model.RetrievePaymentExecutionWorkstepResponse;

/**
 * Service interface for handling operations related to BqPaymentExecutionWorkstepApiService.
 */
public interface BqPaymentExecutionWorkstepApiServiceI {

	/**
     * This method includes details about the retrievePaymentExecutionWorkstep.
     * @param paymentexecutionid.
     * @param paymentexecutionworkstepid.
     * @return The response containing details of the retrievePaymentExecutionWorkstep.
     */
    RetrievePaymentExecutionWorkstepResponse retrievePaymentExecutionWorkstep(String paymentexecutionid,String paymentexecutionworkstepid);


}
