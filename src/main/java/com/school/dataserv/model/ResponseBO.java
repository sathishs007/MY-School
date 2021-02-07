/**
 * 
 */
package com.school.dataserv.model;

import java.io.Serializable;

/**
 * @author sathi
 *
 */
public class ResponseBO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6553134168152182762L;
	
	private String responseCode;
	private String responseMessage;
	
	/**
	 * @return the responseCode
	 */
	public String getResponseCode() {
		return responseCode;
	}
	/**
	 * @param responseCode the responseCode to set
	 */
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	/**
	 * @return the responseMessage
	 */
	public String getResponseMessage() {
		return responseMessage;
	}
	/**
	 * @param responseMessage the responseMessage to set
	 */
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	
	

}
