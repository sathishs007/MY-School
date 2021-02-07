package com.school.dataserv.model;

import java.io.Serializable;

public class BaseBO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1005297944385755720L;

	private String message;
	private String token;

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}
	
	
}
