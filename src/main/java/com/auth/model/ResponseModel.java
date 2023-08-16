package com.auth.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ResponseModel {

	@JsonProperty("RESP_CODE")
	private Integer responseCode;

	@JsonProperty("RESPONSE")
	private String response;

	@JsonProperty("RESP_MST")
	private String responseMessage;

	@JsonProperty("DATA")
	private Object dataNode;

	public ResponseModel() {
		super();
		this.dataNode = new ObjectMapper().createObjectNode();
	}

	public Integer getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public Object getDataNode() {
		return dataNode;
	}

	public void setDataNode(Object dataNode) {
		this.dataNode = dataNode;
	}

	public void setSuccess() {
		this.responseCode = 200;
		this.response = "SUCCESS";
		this.responseMessage = "Request Successfully Processed.";
	}

	public void setSuccess(String responseMessage) {
		this.responseCode = 200;
		this.response = "SUCCESS";
		this.responseMessage = responseMessage;
	}

	public void setSuccess(String responseMessage, Object dataNode) {
		this.responseCode = 200;
		this.response = "SUCCESS";
		this.responseMessage = responseMessage;
		this.dataNode = dataNode;
	}

	public void setFailed() {
		this.responseCode = 250;
		this.response = "FAILED";
		this.responseMessage = "Request Failed To Processed.";
	}

	public void setFailed(String responseMessage) {
		this.responseCode = 250;
		this.response = "FAILED";
		this.responseMessage = responseMessage;
	}

	public void setFailed(String responseMessage, Object dataNode) {
		this.responseCode = 250;
		this.response = "FAILED";
		this.responseMessage = responseMessage;
		this.dataNode = dataNode;
	}

	public void setFatalFailed() {
		this.responseCode = 999;
		this.response = "FATAL_FAILED";
		this.responseMessage = "Some problem has came across, Contact Administrator";
		this.dataNode = "{}";
	}

	public void setFatalFailed(String exception) {
		this.responseCode = 999;
		this.response = "FATAL_FAILED";
		this.responseMessage = "Some problem has came across, Contact Administrator";
		this.dataNode = exception;
	}
}
