package com.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Payment Execution. 
 */
@Schema(name = "PaymentExecutionProcedure", description = "Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Payment Execution. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-02T09:07:33.007512365Z[GMT]")public class PaymentExecutionProcedure {

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

  private String date;

  private Object washAccountReference;

  private Object intermediaryAccountReference;

  private String paymentMechanismType;

  public PaymentExecutionProcedure acHAccessServiceSessionReference(Object acHAccessServiceSessionReference) {
    this.acHAccessServiceSessionReference = acHAccessServiceSessionReference;
    return this;
  }

  /**
   * Reference to the ACH financial gateway service used to execute payments
   * @return acHAccessServiceSessionReference
  */
    @Schema(name = "ACHAccessServiceSessionReference", description = "Reference to the ACH financial gateway service used to execute payments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ACHAccessServiceSessionReference")
  public Object getAcHAccessServiceSessionReference() {
    return acHAccessServiceSessionReference;
  }

  public void setAcHAccessServiceSessionReference(Object acHAccessServiceSessionReference) {
    this.acHAccessServiceSessionReference = acHAccessServiceSessionReference;
  }

  public PaymentExecutionProcedure acHAccessSchedule(String acHAccessSchedule) {
    this.acHAccessSchedule = acHAccessSchedule;
    return this;
  }

  /**
   * The published gateway service availability
   * @return acHAccessSchedule
  */
    @Schema(name = "ACHAccessSchedule", description = "The published gateway service availability", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ACHAccessSchedule")
  public String getAcHAccessSchedule() {
    return acHAccessSchedule;
  }

  public void setAcHAccessSchedule(String acHAccessSchedule) {
    this.acHAccessSchedule = acHAccessSchedule;
  }

  public PaymentExecutionProcedure correspondentServiceSessionReference(Object correspondentServiceSessionReference) {
    this.correspondentServiceSessionReference = correspondentServiceSessionReference;
    return this;
  }

  /**
   * Reference to the SWIFT gateway service used to execute correspondent payments
   * @return correspondentServiceSessionReference
  */
    @Schema(name = "CorrespondentServiceSessionReference", description = "Reference to the SWIFT gateway service used to execute correspondent payments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CorrespondentServiceSessionReference")
  public Object getCorrespondentServiceSessionReference() {
    return correspondentServiceSessionReference;
  }

  public void setCorrespondentServiceSessionReference(Object correspondentServiceSessionReference) {
    this.correspondentServiceSessionReference = correspondentServiceSessionReference;
  }

  public PaymentExecutionProcedure correspondentServiceAccessSchedule(String correspondentServiceAccessSchedule) {
    this.correspondentServiceAccessSchedule = correspondentServiceAccessSchedule;
    return this;
  }

  /**
   * The published gateway service availability
   * @return correspondentServiceAccessSchedule
  */
    @Schema(name = "CorrespondentServiceAccessSchedule", description = "The published gateway service availability", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CorrespondentServiceAccessSchedule")
  public String getCorrespondentServiceAccessSchedule() {
    return correspondentServiceAccessSchedule;
  }

  public void setCorrespondentServiceAccessSchedule(String correspondentServiceAccessSchedule) {
    this.correspondentServiceAccessSchedule = correspondentServiceAccessSchedule;
  }

  public PaymentExecutionProcedure paymentTransactionInitiatorReference(Object paymentTransactionInitiatorReference) {
    this.paymentTransactionInitiatorReference = paymentTransactionInitiatorReference;
    return this;
  }

  /**
   * Reference to the initiator of the transaction
   * @return paymentTransactionInitiatorReference
  */
    @Schema(name = "PaymentTransactionInitiatorReference", description = "Reference to the initiator of the transaction", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PaymentTransactionInitiatorReference")
  public Object getPaymentTransactionInitiatorReference() {
    return paymentTransactionInitiatorReference;
  }

  public void setPaymentTransactionInitiatorReference(Object paymentTransactionInitiatorReference) {
    this.paymentTransactionInitiatorReference = paymentTransactionInitiatorReference;
  }

  public PaymentExecutionProcedure paymentOrderReference(Object paymentOrderReference) {
    this.paymentOrderReference = paymentOrderReference;
    return this;
  }

  /**
   * Reference to the payment order leading to the execution request
   * @return paymentOrderReference
  */
    @Schema(name = "PaymentOrderReference", description = "Reference to the payment order leading to the execution request", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PaymentOrderReference")
  public Object getPaymentOrderReference() {
    return paymentOrderReference;
  }

  public void setPaymentOrderReference(Object paymentOrderReference) {
    this.paymentOrderReference = paymentOrderReference;
  }

  public PaymentExecutionProcedure payerReference(Object payerReference) {
    this.payerReference = payerReference;
    return this;
  }

  /**
   * Reference to the payer
   * @return payerReference
  */
    @Schema(name = "PayerReference", description = "Reference to the payer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PayerReference")
  public Object getPayerReference() {
    return payerReference;
  }

  public void setPayerReference(Object payerReference) {
    this.payerReference = payerReference;
  }

  public PaymentExecutionProcedure payerBankReference(Object payerBankReference) {
    this.payerBankReference = payerBankReference;
    return this;
  }

  /**
   * Reference to the payer's bank
   * @return payerBankReference
  */
    @Schema(name = "PayerBankReference", description = "Reference to the payer's bank", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PayerBankReference")
  public Object getPayerBankReference() {
    return payerBankReference;
  }

  public void setPayerBankReference(Object payerBankReference) {
    this.payerBankReference = payerBankReference;
  }

  public PaymentExecutionProcedure payerProductInstanceReference(Object payerProductInstanceReference) {
    this.payerProductInstanceReference = payerProductInstanceReference;
    return this;
  }

  /**
   * Reference to the payer's account (the source of funds)
   * @return payerProductInstanceReference
  */
    @Schema(name = "PayerProductInstanceReference", description = "Reference to the payer's account (the source of funds)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PayerProductInstanceReference")
  public Object getPayerProductInstanceReference() {
    return payerProductInstanceReference;
  }

  public void setPayerProductInstanceReference(Object payerProductInstanceReference) {
    this.payerProductInstanceReference = payerProductInstanceReference;
  }

  public PaymentExecutionProcedure payeeReference(Object payeeReference) {
    this.payeeReference = payeeReference;
    return this;
  }

  /**
   * The target for the payment
   * @return payeeReference
  */
    @Schema(name = "PayeeReference", description = "The target for the payment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PayeeReference")
  public Object getPayeeReference() {
    return payeeReference;
  }

  public void setPayeeReference(Object payeeReference) {
    this.payeeReference = payeeReference;
  }

  public PaymentExecutionProcedure payeeBankReference(Object payeeBankReference) {
    this.payeeBankReference = payeeBankReference;
    return this;
  }

  /**
   * Reference to the payee's bank
   * @return payeeBankReference
  */
    @Schema(name = "PayeeBankReference", description = "Reference to the payee's bank", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PayeeBankReference")
  public Object getPayeeBankReference() {
    return payeeBankReference;
  }

  public void setPayeeBankReference(Object payeeBankReference) {
    this.payeeBankReference = payeeBankReference;
  }

  public PaymentExecutionProcedure payeeProductInstanceReference(Object payeeProductInstanceReference) {
    this.payeeProductInstanceReference = payeeProductInstanceReference;
    return this;
  }

  /**
   * Reference to the payee's account (the target for the funds)
   * @return payeeProductInstanceReference
  */
    @Schema(name = "PayeeProductInstanceReference", description = "Reference to the payee's account (the target for the funds)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PayeeProductInstanceReference")
  public Object getPayeeProductInstanceReference() {
    return payeeProductInstanceReference;
  }

  public void setPayeeProductInstanceReference(Object payeeProductInstanceReference) {
    this.payeeProductInstanceReference = payeeProductInstanceReference;
  }

  public PaymentExecutionProcedure amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Key amounts included in the transaction
   * @return amount
  */
    @Schema(name = "Amount", description = "Key amounts included in the transaction", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Amount")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public PaymentExecutionProcedure currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Currency for the amounts
   * @return currency
  */
    @Schema(name = "Currency", description = "Currency for the amounts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public PaymentExecutionProcedure dateType(String dateType) {
    this.dateType = dateType;
    return this;
  }

  /**
   * Key dates associated with the transaction (e.g. order, booking, execution, value date, interest bearing)
   * @return dateType
  */
    @Schema(name = "DateType", description = "Key dates associated with the transaction (e.g. order, booking, execution, value date, interest bearing)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DateType")
  public String getDateType() {
    return dateType;
  }

  public void setDateType(String dateType) {
    this.dateType = dateType;
  }

  public PaymentExecutionProcedure date(String date) {
    this.date = date;
    return this;
  }

  /**
   * ….
   * @return date
  */
    @Schema(name = "Date", description = "….", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Date")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public PaymentExecutionProcedure washAccountReference(Object washAccountReference) {
    this.washAccountReference = washAccountReference;
    return this;
  }

  /**
   * Reference to any internal accounts used in processing
   * @return washAccountReference
  */
    @Schema(name = "WashAccountReference", description = "Reference to any internal accounts used in processing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("WashAccountReference")
  public Object getWashAccountReference() {
    return washAccountReference;
  }

  public void setWashAccountReference(Object washAccountReference) {
    this.washAccountReference = washAccountReference;
  }

  public PaymentExecutionProcedure intermediaryAccountReference(Object intermediaryAccountReference) {
    this.intermediaryAccountReference = intermediaryAccountReference;
    return this;
  }

  /**
   * Reference to any external accounts used in processing
   * @return intermediaryAccountReference
  */
    @Schema(name = "IntermediaryAccountReference", description = "Reference to any external accounts used in processing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IntermediaryAccountReference")
  public Object getIntermediaryAccountReference() {
    return intermediaryAccountReference;
  }

  public void setIntermediaryAccountReference(Object intermediaryAccountReference) {
    this.intermediaryAccountReference = intermediaryAccountReference;
  }

  public PaymentExecutionProcedure paymentMechanismType(String paymentMechanismType) {
    this.paymentMechanismType = paymentMechanismType;
    return this;
  }

  /**
   * Requested and actual payment mechanism used
   * @return paymentMechanismType
  */
    @Schema(name = "PaymentMechanismType", description = "Requested and actual payment mechanism used", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    PaymentExecutionProcedure paymentExecutionProcedure = (PaymentExecutionProcedure) o;
    return Objects.equals(this.acHAccessServiceSessionReference, paymentExecutionProcedure.acHAccessServiceSessionReference) &&
        Objects.equals(this.acHAccessSchedule, paymentExecutionProcedure.acHAccessSchedule) &&
        Objects.equals(this.correspondentServiceSessionReference, paymentExecutionProcedure.correspondentServiceSessionReference) &&
        Objects.equals(this.correspondentServiceAccessSchedule, paymentExecutionProcedure.correspondentServiceAccessSchedule) &&
        Objects.equals(this.paymentTransactionInitiatorReference, paymentExecutionProcedure.paymentTransactionInitiatorReference) &&
        Objects.equals(this.paymentOrderReference, paymentExecutionProcedure.paymentOrderReference) &&
        Objects.equals(this.payerReference, paymentExecutionProcedure.payerReference) &&
        Objects.equals(this.payerBankReference, paymentExecutionProcedure.payerBankReference) &&
        Objects.equals(this.payerProductInstanceReference, paymentExecutionProcedure.payerProductInstanceReference) &&
        Objects.equals(this.payeeReference, paymentExecutionProcedure.payeeReference) &&
        Objects.equals(this.payeeBankReference, paymentExecutionProcedure.payeeBankReference) &&
        Objects.equals(this.payeeProductInstanceReference, paymentExecutionProcedure.payeeProductInstanceReference) &&
        Objects.equals(this.amount, paymentExecutionProcedure.amount) &&
        Objects.equals(this.currency, paymentExecutionProcedure.currency) &&
        Objects.equals(this.dateType, paymentExecutionProcedure.dateType) &&
        Objects.equals(this.date, paymentExecutionProcedure.date) &&
        Objects.equals(this.washAccountReference, paymentExecutionProcedure.washAccountReference) &&
        Objects.equals(this.intermediaryAccountReference, paymentExecutionProcedure.intermediaryAccountReference) &&
        Objects.equals(this.paymentMechanismType, paymentExecutionProcedure.paymentMechanismType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acHAccessServiceSessionReference, acHAccessSchedule, correspondentServiceSessionReference, correspondentServiceAccessSchedule, paymentTransactionInitiatorReference, paymentOrderReference, payerReference, payerBankReference, payerProductInstanceReference, payeeReference, payeeBankReference, payeeProductInstanceReference, amount, currency, dateType, date, washAccountReference, intermediaryAccountReference, paymentMechanismType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentExecutionProcedure {\n");
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
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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
