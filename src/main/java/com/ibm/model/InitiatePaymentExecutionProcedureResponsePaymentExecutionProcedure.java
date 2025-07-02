package com.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * InitiatePaymentExecutionProcedureResponsePaymentExecutionProcedure
 */
@JsonTypeName("InitiatePaymentExecutionProcedureResponse_PaymentExecutionProcedure")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-02T09:07:33.007512365Z[GMT]")public class InitiatePaymentExecutionProcedureResponsePaymentExecutionProcedure {

  private Object acHAccessServiceSessionReference;

  private String acHAccessSchedule;

  private Object correspondentServiceSessionReference;

  private String correspondentServiceAccessSchedule;

  public InitiatePaymentExecutionProcedureResponsePaymentExecutionProcedure acHAccessServiceSessionReference(Object acHAccessServiceSessionReference) {
    this.acHAccessServiceSessionReference = acHAccessServiceSessionReference;
    return this;
  }

  /**
   *  
   * @return acHAccessServiceSessionReference
  */
    @Schema(name = "ACHAccessServiceSessionReference", description = " ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ACHAccessServiceSessionReference")
  public Object getAcHAccessServiceSessionReference() {
    return acHAccessServiceSessionReference;
  }

  public void setAcHAccessServiceSessionReference(Object acHAccessServiceSessionReference) {
    this.acHAccessServiceSessionReference = acHAccessServiceSessionReference;
  }

  public InitiatePaymentExecutionProcedureResponsePaymentExecutionProcedure acHAccessSchedule(String acHAccessSchedule) {
    this.acHAccessSchedule = acHAccessSchedule;
    return this;
  }

  /**
   *  
   * @return acHAccessSchedule
  */
    @Schema(name = "ACHAccessSchedule", description = " ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ACHAccessSchedule")
  public String getAcHAccessSchedule() {
    return acHAccessSchedule;
  }

  public void setAcHAccessSchedule(String acHAccessSchedule) {
    this.acHAccessSchedule = acHAccessSchedule;
  }

  public InitiatePaymentExecutionProcedureResponsePaymentExecutionProcedure correspondentServiceSessionReference(Object correspondentServiceSessionReference) {
    this.correspondentServiceSessionReference = correspondentServiceSessionReference;
    return this;
  }

  /**
   *  
   * @return correspondentServiceSessionReference
  */
    @Schema(name = "CorrespondentServiceSessionReference", description = " ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CorrespondentServiceSessionReference")
  public Object getCorrespondentServiceSessionReference() {
    return correspondentServiceSessionReference;
  }

  public void setCorrespondentServiceSessionReference(Object correspondentServiceSessionReference) {
    this.correspondentServiceSessionReference = correspondentServiceSessionReference;
  }

  public InitiatePaymentExecutionProcedureResponsePaymentExecutionProcedure correspondentServiceAccessSchedule(String correspondentServiceAccessSchedule) {
    this.correspondentServiceAccessSchedule = correspondentServiceAccessSchedule;
    return this;
  }

  /**
   *  
   * @return correspondentServiceAccessSchedule
  */
    @Schema(name = "CorrespondentServiceAccessSchedule", description = " ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CorrespondentServiceAccessSchedule")
  public String getCorrespondentServiceAccessSchedule() {
    return correspondentServiceAccessSchedule;
  }

  public void setCorrespondentServiceAccessSchedule(String correspondentServiceAccessSchedule) {
    this.correspondentServiceAccessSchedule = correspondentServiceAccessSchedule;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiatePaymentExecutionProcedureResponsePaymentExecutionProcedure initiatePaymentExecutionProcedureResponsePaymentExecutionProcedure = (InitiatePaymentExecutionProcedureResponsePaymentExecutionProcedure) o;
    return Objects.equals(this.acHAccessServiceSessionReference, initiatePaymentExecutionProcedureResponsePaymentExecutionProcedure.acHAccessServiceSessionReference) &&
        Objects.equals(this.acHAccessSchedule, initiatePaymentExecutionProcedureResponsePaymentExecutionProcedure.acHAccessSchedule) &&
        Objects.equals(this.correspondentServiceSessionReference, initiatePaymentExecutionProcedureResponsePaymentExecutionProcedure.correspondentServiceSessionReference) &&
        Objects.equals(this.correspondentServiceAccessSchedule, initiatePaymentExecutionProcedureResponsePaymentExecutionProcedure.correspondentServiceAccessSchedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acHAccessServiceSessionReference, acHAccessSchedule, correspondentServiceSessionReference, correspondentServiceAccessSchedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiatePaymentExecutionProcedureResponsePaymentExecutionProcedure {\n");
    sb.append("    acHAccessServiceSessionReference: ").append(toIndentedString(acHAccessServiceSessionReference)).append("\n");
    sb.append("    acHAccessSchedule: ").append(toIndentedString(acHAccessSchedule)).append("\n");
    sb.append("    correspondentServiceSessionReference: ").append(toIndentedString(correspondentServiceSessionReference)).append("\n");
    sb.append("    correspondentServiceAccessSchedule: ").append(toIndentedString(correspondentServiceAccessSchedule)).append("\n");
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
