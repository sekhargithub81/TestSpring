package com.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Output: ReBQ Retrieve details about the gateway transaction
 */
@Schema(name = "RetrievePaymentExecutionWorkstepResponse", description = "Output: ReBQ Retrieve details about the gateway transaction")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-02T09:07:33.007512365Z[GMT]")public class RetrievePaymentExecutionWorkstepResponse {

  private RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure paymentExecutionProcedure;

  private RetrievePaymentMechanismResponsePaymentMechanism paymentExecutionWorkstep;

  public RetrievePaymentExecutionWorkstepResponse paymentExecutionProcedure(RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure paymentExecutionProcedure) {
    this.paymentExecutionProcedure = paymentExecutionProcedure;
    return this;
  }

  /**
   * Get paymentExecutionProcedure
   * @return paymentExecutionProcedure
  */
  @Valid   @Schema(name = "PaymentExecutionProcedure", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PaymentExecutionProcedure")
  public RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure getPaymentExecutionProcedure() {
    return paymentExecutionProcedure;
  }

  public void setPaymentExecutionProcedure(RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure paymentExecutionProcedure) {
    this.paymentExecutionProcedure = paymentExecutionProcedure;
  }

  public RetrievePaymentExecutionWorkstepResponse paymentExecutionWorkstep(RetrievePaymentMechanismResponsePaymentMechanism paymentExecutionWorkstep) {
    this.paymentExecutionWorkstep = paymentExecutionWorkstep;
    return this;
  }

  /**
   * Get paymentExecutionWorkstep
   * @return paymentExecutionWorkstep
  */
  @Valid   @Schema(name = "PaymentExecutionWorkstep", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PaymentExecutionWorkstep")
  public RetrievePaymentMechanismResponsePaymentMechanism getPaymentExecutionWorkstep() {
    return paymentExecutionWorkstep;
  }

  public void setPaymentExecutionWorkstep(RetrievePaymentMechanismResponsePaymentMechanism paymentExecutionWorkstep) {
    this.paymentExecutionWorkstep = paymentExecutionWorkstep;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrievePaymentExecutionWorkstepResponse retrievePaymentExecutionWorkstepResponse = (RetrievePaymentExecutionWorkstepResponse) o;
    return Objects.equals(this.paymentExecutionProcedure, retrievePaymentExecutionWorkstepResponse.paymentExecutionProcedure) &&
        Objects.equals(this.paymentExecutionWorkstep, retrievePaymentExecutionWorkstepResponse.paymentExecutionWorkstep);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentExecutionProcedure, paymentExecutionWorkstep);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrievePaymentExecutionWorkstepResponse {\n");
    sb.append("    paymentExecutionProcedure: ").append(toIndentedString(paymentExecutionProcedure)).append("\n");
    sb.append("    paymentExecutionWorkstep: ").append(toIndentedString(paymentExecutionWorkstep)).append("\n");
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
