package com.ibm.exception;

import java.util.HashMap;
import java.util.Map;

import com.ibm.model.*;
public class MetaData {

	public static final Map<String,Map<ErrorStatusCode, ApiExceptionResponse>> apiExceptions;

        private static String BADREQUEST= "BadRequest";
        private static String UNAUTHORIZED= "Unauthorized";
        private static String FORBIDDEN= "Forbidden";
        private static String NOTFOUND= "NotFound";
        private static String TOOMANYREQUESTS= "TooManyRequests";
        private static String INTERNALSERVERERROR= "InternalServerError";

	private MetaData() {
        throw new AssertionError();
    }
	
	static {		
		apiExceptions = new HashMap<String,Map<ErrorStatusCode, ApiExceptionResponse>>();

		Map<ErrorStatusCode, ApiExceptionResponse> responses; 
		try {
		
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(400),ApiExceptionResponse.getInstance(400,HTTPError.class, BADREQUEST ));
		 responses.put(ErrorStatusCode.getStatusCode(401),ApiExceptionResponse.getInstance(401,HTTPError.class, UNAUTHORIZED ));
		 responses.put(ErrorStatusCode.getStatusCode(403),ApiExceptionResponse.getInstance(403,HTTPError.class, FORBIDDEN ));
		 responses.put(ErrorStatusCode.getStatusCode(404),ApiExceptionResponse.getInstance(404,HTTPError.class, NOTFOUND ));
		 responses.put(ErrorStatusCode.getStatusCode(429),ApiExceptionResponse.getInstance(429,HTTPError.class, TOOMANYREQUESTS ));
		 responses.put(ErrorStatusCode.getStatusCode(500),ApiExceptionResponse.getInstance(500,HTTPError.class, INTERNALSERVERERROR ));
		 
		 apiExceptions.put("initiate",responses);
		 
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(400),ApiExceptionResponse.getInstance(400,HTTPError.class, BADREQUEST ));
		 responses.put(ErrorStatusCode.getStatusCode(401),ApiExceptionResponse.getInstance(401,HTTPError.class, UNAUTHORIZED ));
		 responses.put(ErrorStatusCode.getStatusCode(403),ApiExceptionResponse.getInstance(403,HTTPError.class, FORBIDDEN ));
		 responses.put(ErrorStatusCode.getStatusCode(404),ApiExceptionResponse.getInstance(404,HTTPError.class, NOTFOUND ));
		 responses.put(ErrorStatusCode.getStatusCode(429),ApiExceptionResponse.getInstance(429,HTTPError.class, TOOMANYREQUESTS ));
		 responses.put(ErrorStatusCode.getStatusCode(500),ApiExceptionResponse.getInstance(500,HTTPError.class, INTERNALSERVERERROR ));
		 
		 apiExceptions.put("update",responses);
		 
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(400),ApiExceptionResponse.getInstance(400,HTTPError.class, BADREQUEST ));
		 responses.put(ErrorStatusCode.getStatusCode(401),ApiExceptionResponse.getInstance(401,HTTPError.class, UNAUTHORIZED ));
		 responses.put(ErrorStatusCode.getStatusCode(403),ApiExceptionResponse.getInstance(403,HTTPError.class, FORBIDDEN ));
		 responses.put(ErrorStatusCode.getStatusCode(404),ApiExceptionResponse.getInstance(404,HTTPError.class, NOTFOUND ));
		 responses.put(ErrorStatusCode.getStatusCode(429),ApiExceptionResponse.getInstance(429,HTTPError.class, TOOMANYREQUESTS ));
		 responses.put(ErrorStatusCode.getStatusCode(500),ApiExceptionResponse.getInstance(500,HTTPError.class, INTERNALSERVERERROR ));
		 
		 apiExceptions.put("retrieve",responses);
		 
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(400),ApiExceptionResponse.getInstance(400,HTTPError.class, BADREQUEST ));
		 responses.put(ErrorStatusCode.getStatusCode(401),ApiExceptionResponse.getInstance(401,HTTPError.class, UNAUTHORIZED ));
		 responses.put(ErrorStatusCode.getStatusCode(403),ApiExceptionResponse.getInstance(403,HTTPError.class, FORBIDDEN ));
		 responses.put(ErrorStatusCode.getStatusCode(404),ApiExceptionResponse.getInstance(404,HTTPError.class, NOTFOUND ));
		 responses.put(ErrorStatusCode.getStatusCode(429),ApiExceptionResponse.getInstance(429,HTTPError.class, TOOMANYREQUESTS ));
		 responses.put(ErrorStatusCode.getStatusCode(500),ApiExceptionResponse.getInstance(500,HTTPError.class, INTERNALSERVERERROR ));
		 
		 apiExceptions.put("retrievePaymentMechanism",responses);
		 
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(400),ApiExceptionResponse.getInstance(400,HTTPError.class, BADREQUEST ));
		 responses.put(ErrorStatusCode.getStatusCode(401),ApiExceptionResponse.getInstance(401,HTTPError.class, UNAUTHORIZED ));
		 responses.put(ErrorStatusCode.getStatusCode(403),ApiExceptionResponse.getInstance(403,HTTPError.class, FORBIDDEN ));
		 responses.put(ErrorStatusCode.getStatusCode(404),ApiExceptionResponse.getInstance(404,HTTPError.class, NOTFOUND ));
		 responses.put(ErrorStatusCode.getStatusCode(429),ApiExceptionResponse.getInstance(429,HTTPError.class, TOOMANYREQUESTS ));
		 responses.put(ErrorStatusCode.getStatusCode(500),ApiExceptionResponse.getInstance(500,HTTPError.class, INTERNALSERVERERROR ));
		 
		 apiExceptions.put("retrievePaymentExecutionWorkstep",responses);
		 
		
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}
}
