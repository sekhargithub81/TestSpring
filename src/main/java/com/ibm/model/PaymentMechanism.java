package com.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation
 */
@Schema(name = "PaymentMechanism", description = "The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-02T09:07:33.007512365Z[GMT]")public class PaymentMechanism {

  private String paymentExecutionTaskResult;

  public PaymentMechanism paymentExecutionTaskResult(String paymentExecutionTaskResult) {
    this.paymentExecutionTaskResult = paymentExecutionTaskResult;
    return this;
  }

  /**
   * Details of the mechanism selection
   * @return paymentExecutionTaskResult
  */
    @Schema(name = "PaymentExecutionTaskResult", description = "Details of the mechanism selection", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    PaymentMechanism paymentMechanism = (PaymentMechanism) o;
    return Objects.equals(this.paymentExecutionTaskResult, paymentMechanism.paymentExecutionTaskResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentExecutionTaskResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMechanism {\n");
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
