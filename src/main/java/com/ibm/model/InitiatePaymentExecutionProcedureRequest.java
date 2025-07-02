package com.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Input: InCR Initiate a payment execution procedure
 */
@Schema(name = "InitiatePaymentExecutionProcedureRequest", description = "Input: InCR Initiate a payment execution procedure")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-02T09:07:33.007512365Z[GMT]")public class InitiatePaymentExecutionProcedureRequest {

  private InitiatePaymentExecutionProcedureRequestPaymentExecutionProcedure paymentExecutionProcedure;

  public InitiatePaymentExecutionProcedureRequest paymentExecutionProcedure(InitiatePaymentExecutionProcedureRequestPaymentExecutionProcedure paymentExecutionProcedure) {
    this.paymentExecutionProcedure = paymentExecutionProcedure;
    return this;
  }

  /**
   * Get paymentExecutionProcedure
   * @return paymentExecutionProcedure
  */
  @Valid   @Schema(name = "PaymentExecutionProcedure", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PaymentExecutionProcedure")
  public InitiatePaymentExecutionProcedureRequestPaymentExecutionProcedure getPaymentExecutionProcedure() {
    return paymentExecutionProcedure;
  }

  public void setPaymentExecutionProcedure(InitiatePaymentExecutionProcedureRequestPaymentExecutionProcedure paymentExecutionProcedure) {
    this.paymentExecutionProcedure = paymentExecutionProcedure;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiatePaymentExecutionProcedureRequest initiatePaymentExecutionProcedureRequest = (InitiatePaymentExecutionProcedureRequest) o;
    return Objects.equals(this.paymentExecutionProcedure, initiatePaymentExecutionProcedureRequest.paymentExecutionProcedure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentExecutionProcedure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiatePaymentExecutionProcedureRequest {\n");
    sb.append("    paymentExecutionProcedure: ").append(toIndentedString(paymentExecutionProcedure)).append("\n");
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
