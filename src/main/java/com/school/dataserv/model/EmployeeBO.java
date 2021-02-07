/**
 * 
 */
package com.school.dataserv.model;

import java.io.Serializable;
import java.sql.Blob;
import java.sql.SQLException;

import javax.sql.rowset.serial.SerialBlob;
import javax.sql.rowset.serial.SerialException;

/**
 * @author sathish
 *
 */
public class EmployeeBO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5474185967788600118L;
	
	private String name;
	private String empId;
	private String lastName;
	private String firstName;
	private String homePhone;
	private String email;
	private String alternateEmail;
	private String designation;
	private String grade;
	private String countryCode;
	private String workLocation;
	private String workCountryCode; 
	private String reportingManagerId;
	private String projectId;
	private String rmName;
	private String projectName;
	private Blob template;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the empId
	 */
	public String getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the homePhone
	 */
	public String getHomePhone() {
		return homePhone;
	}
	/**
	 * @param homePhone the homePhone to set
	 */
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the alternateEmail
	 */
	public String getAlternateEmail() {
		return alternateEmail;
	}
	/**
	 * @param alternateEmail the alternateEmail to set
	 */
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}
	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}
	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}
	/**
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}
	/**
	 * @param countryCode the countryCode to set
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	/**
	 * @return the workLocation
	 */
	public String getWorkLocation() {
		return workLocation;
	}
	/**
	 * @param workLocation the workLocation to set
	 */
	public void setWorkLocation(String workLocation) {
		this.workLocation = workLocation;
	}
	/**
	 * @return the workCountryCode
	 */
	public String getWorkCountryCode() {
		return workCountryCode;
	}
	/**
	 * @param workCountryCode the workCountryCode to set
	 */
	public void setWorkCountryCode(String workCountryCode) {
		this.workCountryCode = workCountryCode;
	}
	/**
	 * @return the reportingManagerId
	 */
	public String getReportingManagerId() {
		return reportingManagerId;
	}
	/**
	 * @param reportingManagerId the reportingManagerId to set
	 */
	public void setReportingManagerId(String reportingManagerId) {
		this.reportingManagerId = reportingManagerId;
	}
	/**
	 * @return the projectId
	 */
	public String getProjectId() {
		return projectId;
	}
	/**
	 * @param projectId the projectId to set
	 */
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	/**
	 * @return the rmName
	 */
	public String getRmName() {
		return rmName;
	}
	/**
	 * @param rmName the rmName to set
	 */
	public void setRmName(String rmName) {
		this.rmName = rmName;
	}
	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}
	/**
	 * @param projectName the projectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	

	/**
	 * @return the uploadResume
	 */
	public Blob getUploadResume() {
		return this.template;
	}

	/**
	 * @param uploadResume
	 *            the uploadResume to set
	 * @throws SQLException
	 * @throws SerialException
	 */
	public void setUploadResume(byte[] template) throws SerialException,
			SQLException {
		if (null != template) {
			this.template = new SerialBlob(template);
		} else {
			this.template = null;
		}
	}
	
}
