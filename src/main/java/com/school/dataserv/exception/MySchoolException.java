package com.school.dataserv.exception;

public class MySchoolException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2070446339334329684L;

	private String errorMessage;
	private String errorCode;

	public MySchoolException() {

	}

	public MySchoolException(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public MySchoolException(String errorMessage, String errorCode) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * @param errorMessage the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	
}
