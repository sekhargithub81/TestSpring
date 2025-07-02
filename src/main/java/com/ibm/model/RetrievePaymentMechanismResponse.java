package com.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Output: ReBQ Retrieve details about the payment mechanism selection
 */
@Schema(name = "RetrievePaymentMechanismResponse", description = "Output: ReBQ Retrieve details about the payment mechanism selection")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-02T09:07:33.007512365Z[GMT]")public class RetrievePaymentMechanismResponse {

  private RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure paymentExecutionProcedure;

  private RetrievePaymentMechanismResponsePaymentMechanism paymentMechanism;

  public RetrievePaymentMechanismResponse paymentExecutionProcedure(RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure paymentExecutionProcedure) {
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

  public RetrievePaymentMechanismResponse paymentMechanism(RetrievePaymentMechanismResponsePaymentMechanism paymentMechanism) {
    this.paymentMechanism = paymentMechanism;
    return this;
  }

  /**
   * Get paymentMechanism
   * @return paymentMechanism
  */
  @Valid   @Schema(name = "PaymentMechanism", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PaymentMechanism")
  public RetrievePaymentMechanismResponsePaymentMechanism getPaymentMechanism() {
    return paymentMechanism;
  }

  public void setPaymentMechanism(RetrievePaymentMechanismResponsePaymentMechanism paymentMechanism) {
    this.paymentMechanism = paymentMechanism;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrievePaymentMechanismResponse retrievePaymentMechanismResponse = (RetrievePaymentMechanismResponse) o;
    return Objects.equals(this.paymentExecutionProcedure, retrievePaymentMechanismResponse.paymentExecutionProcedure) &&
        Objects.equals(this.paymentMechanism, retrievePaymentMechanismResponse.paymentMechanism);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentExecutionProcedure, paymentMechanism);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrievePaymentMechanismResponse {\n");
    sb.append("    paymentExecutionProcedure: ").append(toIndentedString(paymentExecutionProcedure)).append("\n");
    sb.append("    paymentMechanism: ").append(toIndentedString(paymentMechanism)).append("\n");
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
