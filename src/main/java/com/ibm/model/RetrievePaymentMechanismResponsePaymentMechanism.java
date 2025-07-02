package com.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * RetrievePaymentMechanismResponsePaymentMechanism
 */
@JsonTypeName("RetrievePaymentMechanismResponse_PaymentMechanism")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-02T09:07:33.007512365Z[GMT]")public class RetrievePaymentMechanismResponsePaymentMechanism {

  private String paymentExecutionTaskResult;

  public RetrievePaymentMechanismResponsePaymentMechanism paymentExecutionTaskResult(String paymentExecutionTaskResult) {
    this.paymentExecutionTaskResult = paymentExecutionTaskResult;
    return this;
  }

  /**
   *  
   * @return paymentExecutionTaskResult
  */
    @Schema(name = "PaymentExecutionTaskResult", description = " ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PaymentExecutionTaskResult")
  public String getPaymentExecutionTaskResult() {
    return paymentExecutionTaskResult;
  }

  public void setPaymentExecutionTaskResult(String paymentExecutionTaskResult) {
    this.paymentExecutionTaskResult = paymentExecutionTaskResult;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrievePaymentMechanismResponsePaymentMechanism retrievePaymentMechanismResponsePaymentMechanism = (RetrievePaymentMechanismResponsePaymentMechanism) o;
    return Objects.equals(this.paymentExecutionTaskResult, retrievePaymentMechanismResponsePaymentMechanism.paymentExecutionTaskResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentExecutionTaskResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrievePaymentMechanismResponsePaymentMechanism {\n");
    sb.append("    paymentExecutionTaskResult: ").append(toIndentedString(paymentExecutionTaskResult)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
