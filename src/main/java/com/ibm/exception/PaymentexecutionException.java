package com.ibm.exception;

import com.google.gson.Gson;
/**
 * This class defines the PaymentexecutionException. 
 * An exception can be thrown as PaymentexecutionException by setting the ErrorResponse with its information.
 */
public class PaymentexecutionException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private final ErrorResponse errorResponse;

	public PaymentexecutionException() {
		super();
		errorResponse = new ErrorResponse();
	}

	public PaymentexecutionException(Exception e) {
		super(e);
		errorResponse = new ErrorResponse();
	}

	public PaymentexecutionException(String message, ErrorResponse errorResponse) {
		super(message);
		this.errorResponse = errorResponse;
	}

	public PaymentexecutionException(String message, Exception e) {
		super(message, e);
		errorResponse = new ErrorResponse();
	}

	public PaymentexecutionException(String message, ErrorResponse errorResponse, Exception e) {
		super(message, e);
		this.errorResponse = errorResponse;
	}

	public int getHttpCode() {
		if (errorResponse != null && errorResponse.getError() != null && errorResponse.getError().getCode() != null) {
			try {
				return Integer.parseInt(errorResponse.getError().getCode());
			} catch (NumberFormatException nfe) {
				return 400;
			}
		}
		return 400;
	}

	public ErrorResponse getErrorResponse() {
		return errorResponse;
	}

	public String getErrorResponseText() {
		return new Gson().toJson(errorResponse);
	}
}
