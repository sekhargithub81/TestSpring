package com.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Status Attributes
 */
@Schema(name = "HTTPError", description = "Status Attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-02T09:07:33.007512365Z[GMT]")public class HTTPError {

  private String statusCode;

  private String status;

  private String message;

  public HTTPError statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * Get statusCode
   * @return statusCode
  */
    @Schema(name = "status_code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status_code")
  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  public HTTPError status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
    @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public HTTPError message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  */
    @Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HTTPError htTPError = (HTTPError) o;
    return Objects.equals(this.statusCode, htTPError.statusCode) &&
        Objects.equals(this.status, htTPError.status) &&
        Objects.equals(this.message, htTPError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, status, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HTTPError {\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
