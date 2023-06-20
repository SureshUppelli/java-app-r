package com.abcbs.benefitsx12utilities.models;

public class LoggingParserResponse {

	private String status;
	private String timestamp;
	private String message;
	private LogParse results;

	public LoggingParserResponse() {

	}

	public LoggingParserResponse(String status, String timestamp, String message, LogParse results) {
		super();
		this.status = status;
		this.timestamp = timestamp;
		this.message = message;
		this.results = results;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LogParse getResults() {
		return results;
	}

	public void setResults(LogParse results) {
		this.results = results;
	}

}
