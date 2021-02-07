package com.school.dataserv.exception;

/**
 * for HTTP 400 errors
 */
public final class DataFormatException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 7394041895785537234L;

	public DataFormatException() {
        super();
    }

    public DataFormatException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataFormatException(String message) {
        super(message);
    }

    public DataFormatException(Throwable cause) {
        super(cause);
    }
}