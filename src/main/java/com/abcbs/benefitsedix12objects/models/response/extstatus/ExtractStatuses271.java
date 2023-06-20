package com.abcbs.benefitsedix12objects.models.response.extstatus;

public class ExtractStatuses271 {
	    private String payloadType;
	    private String parseType;
	    private String TransactionStatus;
	    private int httpStatus;
	    private String httpReason;
	    private String message;
	    private String timestamp;
	    private String transactionId;
	    private Results results;

	    public String getPayloadType() {
	        return payloadType;
	    }

	    public void setPayloadType(String payloadType) {
	        this.payloadType = payloadType;
	    }

	    public String getParseType() {
	        return parseType;
	    }

	    public void setParseType(String parseType) {
	        this.parseType = parseType;
	    }

//	    public boolean isSuccess() {
//	        return success;
//	    }
//
//	    public void setSuccess(boolean success) {
//	        this.success = success;
//	    }

	    public int getHttpStatus() {
	        return httpStatus;
	    }

	    public void setHttpStatus(int httpStatus) {
	        this.httpStatus = httpStatus;
	    }

	    public String getHttpReason() {
	        return httpReason;
	    }

	    public void setHttpReason(String httpReason) {
	        this.httpReason = httpReason;
	    }

	    public String getMessage() {
	        return message;
	    }

	    public void setMessage(String message) {
	        this.message = message;
	    }

	    public String getTimestamp() {
	        return timestamp;
	    }

	    public void setTimestamp(String timestamp) {
	        this.timestamp = timestamp;
	    }

	    public String getTransactionId() {
	        return transactionId;
	    }

	    public void setTransactionId(String transactionId) {
	        this.transactionId = transactionId;
	    }

	    public Results getResults() {
	        return results;
	    }

	    public void setResults(Results results) {
	        this.results = results;
	    }

		public String getTransactionStatus() {
			return TransactionStatus;
		}

		public void setTransactionStatus(String transactionStatus) {
			TransactionStatus = transactionStatus;
		}
}
