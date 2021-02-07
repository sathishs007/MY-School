package com.school.dataserv.exception;

import javax.xml.bind.annotation.XmlRootElement;


/*
 * A sample class for adding error information in the response
 */
@XmlRootElement
public class RestErrorInfo {
    @SuppressWarnings("unused")
	private final String detail;
    @SuppressWarnings("unused")
	private final String message;

    public RestErrorInfo(final Exception ex, final String detail) {
        message = ex.getLocalizedMessage();
        this.detail = detail;
    }

}
