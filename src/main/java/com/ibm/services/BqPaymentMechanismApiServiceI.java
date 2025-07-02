package com.ibm.services;

import com.ibm.model.RetrievePaymentMechanismResponse;

/**
 * Service interface for handling operations related to BqPaymentMechanismApiService.
 */
public interface BqPaymentMechanismApiServiceI {

	/**
     * This method includes details about the retrievePaymentMechanism.
     * @param paymentexecutionid.
     * @param paymentmechanismid.
     * @return The response containing details of the retrievePaymentMechanism.
     */
    RetrievePaymentMechanismResponse retrievePaymentMechanism(String paymentexecutionid,String paymentmechanismid);


}
