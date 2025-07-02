package com.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure
 */
@JsonTypeName("RetrievePaymentExecutionProcedureResponse_PaymentExecutionProcedure")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-02T09:07:33.007512365Z[GMT]")public class RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure {

  private Object acHAccessServiceSessionReference;

  private String acHAccessSchedule;

  private Object correspondentServiceSessionReference;

  private String correspondentServiceAccessSchedule;

  private Object paymentTransactionInitiatorReference;

  private Object paymentOrderReference;

  private Object payerReference;

  private Object payerBankReference;

  private Object payerProductInstanceReference;

  private Object payeeReference;

  private Object payeeBankReference;

  private Object payeeProductInstanceReference;

  private String amount;

  private String currency;

  private String dateType;

  private Object washAccountReference;

  private Object intermediaryAccountReference;

  private String paymentMechanismType;

  public RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure acHAccessServiceSessionReference(Object acHAccessServiceSessionReference) {
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

  public RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure acHAccessSchedule(String acHAccessSchedule) {
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

  public RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure correspondentServiceSessionReference(Object correspondentServiceSessionReference) {
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

  public RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure correspondentServiceAccessSchedule(String correspondentServiceAccessSchedule) {
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

  public RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure paymentTransactionInitiatorReference(Object paymentTransactionInitiatorReference) {
    this.paymentTransactionInitiatorReference = paymentTransactionInitiatorReference;
    return this;
  }

  /**
   *  
   * @return paymentTransactionInitiatorReference
  */
    @Schema(name = "PaymentTransactionInitiatorReference", description = " ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PaymentTransactionInitiatorReference")
  public Object getPaymentTransactionInitiatorReference() {
    return paymentTransactionInitiatorReference;
  }

  public void setPaymentTransactionInitiatorReference(Object paymentTransactionInitiatorReference) {
    this.paymentTransactionInitiatorReference = paymentTransactionInitiatorReference;
  }

  public RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure paymentOrderReference(Object paymentOrderReference) {
    this.paymentOrderReference = paymentOrderReference;
    return this;
  }

  /**
   *  
   * @return paymentOrderReference
  */
    @Schema(name = "PaymentOrderReference", description = " ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PaymentOrderReference")
  public Object getPaymentOrderReference() {
    return paymentOrderReference;
  }

  public void setPaymentOrderReference(Object paymentOrderReference) {
    this.paymentOrderReference = paymentOrderReference;
  }

  public RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure payerReference(Object payerReference) {
    this.payerReference = payerReference;
    return this;
  }

  /**
   *  
   * @return payerReference
  */
    @Schema(name = "PayerReference", description = " ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PayerReference")
  public Object getPayerReference() {
    return payerReference;
  }

  public void setPayerReference(Object payerReference) {
    this.payerReference = payerReference;
  }

  public RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure payerBankReference(Object payerBankReference) {
    this.payerBankReference = payerBankReference;
    return this;
  }

  /**
   *  
   * @return payerBankReference
  */
    @Schema(name = "PayerBankReference", description = " ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PayerBankReference")
  public Object getPayerBankReference() {
    return payerBankReference;
  }

  public void setPayerBankReference(Object payerBankReference) {
    this.payerBankReference = payerBankReference;
  }

  public RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure payerProductInstanceReference(Object payerProductInstanceReference) {
    this.payerProductInstanceReference = payerProductInstanceReference;
    return this;
  }

  /**
   *  
   * @return payerProductInstanceReference
  */
    @Schema(name = "PayerProductInstanceReference", description = " ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PayerProductInstanceReference")
  public Object getPayerProductInstanceReference() {
    return payerProductInstanceReference;
  }

  public void setPayerProductInstanceReference(Object payerProductInstanceReference) {
    this.payerProductInstanceReference = payerProductInstanceReference;
  }

  public RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure payeeReference(Object payeeReference) {
    this.payeeReference = payeeReference;
    return this;
  }

  /**
   *  
   * @return payeeReference
  */
    @Schema(name = "PayeeReference", description = " ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PayeeReference")
  public Object getPayeeReference() {
    return payeeReference;
  }

  public void setPayeeReference(Object payeeReference) {
    this.payeeReference = payeeReference;
  }

  public RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure payeeBankReference(Object payeeBankReference) {
    this.payeeBankReference = payeeBankReference;
    return this;
  }

  /**
   *  
   * @return payeeBankReference
  */
    @Schema(name = "PayeeBankReference", description = " ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PayeeBankReference")
  public Object getPayeeBankReference() {
    return payeeBankReference;
  }

  public void setPayeeBankReference(Object payeeBankReference) {
    this.payeeBankReference = payeeBankReference;
  }

  public RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure payeeProductInstanceReference(Object payeeProductInstanceReference) {
    this.payeeProductInstanceReference = payeeProductInstanceReference;
    return this;
  }

  /**
   *  
   * @return payeeProductInstanceReference
  */
    @Schema(name = "PayeeProductInstanceReference", description = " ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PayeeProductInstanceReference")
  public Object getPayeeProductInstanceReference() {
    return payeeProductInstanceReference;
  }

  public void setPayeeProductInstanceReference(Object payeeProductInstanceReference) {
    this.payeeProductInstanceReference = payeeProductInstanceReference;
  }

  public RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   *  
   * @return amount
  */
    @Schema(name = "Amount", description = " ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Amount")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   *  
   * @return currency
  */
    @Schema(name = "Currency", description = " ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure dateType(String dateType) {
    this.dateType = dateType;
    return this;
  }

  /**
   *  
   * @return dateType
  */
    @Schema(name = "DateType", description = " ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DateType")
  public String getDateType() {
    return dateType;
  }

  public void setDateType(String dateType) {
    this.dateType = dateType;
  }

  public RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure washAccountReference(Object washAccountReference) {
    this.washAccountReference = washAccountReference;
    return this;
  }

  /**
   *  
   * @return washAccountReference
  */
    @Schema(name = "WashAccountReference", description = " ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("WashAccountReference")
  public Object getWashAccountReference() {
    return washAccountReference;
  }

  public void setWashAccountReference(Object washAccountReference) {
    this.washAccountReference = washAccountReference;
  }

  public RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure intermediaryAccountReference(Object intermediaryAccountReference) {
    this.intermediaryAccountReference = intermediaryAccountReference;
    return this;
  }

  /**
   *  
   * @return intermediaryAccountReference
  */
    @Schema(name = "IntermediaryAccountReference", description = " ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IntermediaryAccountReference")
  public Object getIntermediaryAccountReference() {
    return intermediaryAccountReference;
  }

  public void setIntermediaryAccountReference(Object intermediaryAccountReference) {
    this.intermediaryAccountReference = intermediaryAccountReference;
  }

  public RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure paymentMechanismType(String paymentMechanismType) {
    this.paymentMechanismType = paymentMechanismType;
    return this;
  }

  /**
   *  
   * @return paymentMechanismType
  */
    @Schema(name = "PaymentMechanismType", description = " ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PaymentMechanismType")
  public String getPaymentMechanismType() {
    return paymentMechanismType;
  }

  public void setPaymentMechanismType(String paymentMechanismType) {
    this.paymentMechanismType = paymentMechanismType;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure retrievePaymentExecutionProcedureResponsePaymentExecutionProcedure = (RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure) o;
    return Objects.equals(this.acHAccessServiceSessionReference, retrievePaymentExecutionProcedureResponsePaymentExecutionProcedure.acHAccessServiceSessionReference) &&
        Objects.equals(this.acHAccessSchedule, retrievePaymentExecutionProcedureResponsePaymentExecutionProcedure.acHAccessSchedule) &&
        Objects.equals(this.correspondentServiceSessionReference, retrievePaymentExecutionProcedureResponsePaymentExecutionProcedure.correspondentServiceSessionReference) &&
        Objects.equals(this.correspondentServiceAccessSchedule, retrievePaymentExecutionProcedureResponsePaymentExecutionProcedure.correspondentServiceAccessSchedule) &&
        Objects.equals(this.paymentTransactionInitiatorReference, retrievePaymentExecutionProcedureResponsePaymentExecutionProcedure.paymentTransactionInitiatorReference) &&
        Objects.equals(this.paymentOrderReference, retrievePaymentExecutionProcedureResponsePaymentExecutionProcedure.paymentOrderReference) &&
        Objects.equals(this.payerReference, retrievePaymentExecutionProcedureResponsePaymentExecutionProcedure.payerReference) &&
        Objects.equals(this.payerBankReference, retrievePaymentExecutionProcedureResponsePaymentExecutionProcedure.payerBankReference) &&
        Objects.equals(this.payerProductInstanceReference, retrievePaymentExecutionProcedureResponsePaymentExecutionProcedure.payerProductInstanceReference) &&
        Objects.equals(this.payeeReference, retrievePaymentExecutionProcedureResponsePaymentExecutionProcedure.payeeReference) &&
        Objects.equals(this.payeeBankReference, retrievePaymentExecutionProcedureResponsePaymentExecutionProcedure.payeeBankReference) &&
        Objects.equals(this.payeeProductInstanceReference, retrievePaymentExecutionProcedureResponsePaymentExecutionProcedure.payeeProductInstanceReference) &&
        Objects.equals(this.amount, retrievePaymentExecutionProcedureResponsePaymentExecutionProcedure.amount) &&
        Objects.equals(this.currency, retrievePaymentExecutionProcedureResponsePaymentExecutionProcedure.currency) &&
        Objects.equals(this.dateType, retrievePaymentExecutionProcedureResponsePaymentExecutionProcedure.dateType) &&
        Objects.equals(this.washAccountReference, retrievePaymentExecutionProcedureResponsePaymentExecutionProcedure.washAccountReference) &&
        Objects.equals(this.intermediaryAccountReference, retrievePaymentExecutionProcedureResponsePaymentExecutionProcedure.intermediaryAccountReference) &&
        Objects.equals(this.paymentMechanismType, retrievePaymentExecutionProcedureResponsePaymentExecutionProcedure.paymentMechanismType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acHAccessServiceSessionReference, acHAccessSchedule, correspondentServiceSessionReference, correspondentServiceAccessSchedule, paymentTransactionInitiatorReference, paymentOrderReference, payerReference, payerBankReference, payerProductInstanceReference, payeeReference, payeeBankReference, payeeProductInstanceReference, amount, currency, dateType, washAccountReference, intermediaryAccountReference, paymentMechanismType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure {\n");
    sb.append("    acHAccessServiceSessionReference: ").append(toIndentedString(acHAccessServiceSessionReference)).append("\n");
    sb.append("    acHAccessSchedule: ").append(toIndentedString(acHAccessSchedule)).append("\n");
    sb.append("    correspondentServiceSessionReference: ").append(toIndentedString(correspondentServiceSessionReference)).append("\n");
    sb.append("    correspondentServiceAccessSchedule: ").append(toIndentedString(correspondentServiceAccessSchedule)).append("\n");
    sb.append("    paymentTransactionInitiatorReference: ").append(toIndentedString(paymentTransactionInitiatorReference)).append("\n");
    sb.append("    paymentOrderReference: ").append(toIndentedString(paymentOrderReference)).append("\n");
    sb.append("    payerReference: ").append(toIndentedString(payerReference)).append("\n");
    sb.append("    payerBankReference: ").append(toIndentedString(payerBankReference)).append("\n");
    sb.append("    payerProductInstanceReference: ").append(toIndentedString(payerProductInstanceReference)).append("\n");
    sb.append("    payeeReference: ").append(toIndentedString(payeeReference)).append("\n");
    sb.append("    payeeBankReference: ").append(toIndentedString(payeeBankReference)).append("\n");
    sb.append("    payeeProductInstanceReference: ").append(toIndentedString(payeeProductInstanceReference)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
    sb.append("    washAccountReference: ").append(toIndentedString(washAccountReference)).append("\n");
    sb.append("    intermediaryAccountReference: ").append(toIndentedString(intermediaryAccountReference)).append("\n");
    sb.append("    paymentMechanismType: ").append(toIndentedString(paymentMechanismType)).append("\n");
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
