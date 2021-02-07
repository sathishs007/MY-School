package com.school.dataserv.model;

import java.util.List;

public class StudenBO extends BaseBO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7119345982626135575L;
	
	private Integer rollNumber;
	private String studentName;
	private String fatherName;
	private String contactNumber;
	private int clas;
	private String section;
	private String address;
	private List<MarkBO>studentMarkList;
	
	/**
	 * @return the rollNumber
	 */
	public Integer getRollNumber() {
		return rollNumber;
	}
	/**
	 * @param rollNumber the rollNumber to set
	 */
	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}
	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	/**
	 * @return the fatherName
	 */
	public String getFatherName() {
		return fatherName;
	}
	/**
	 * @param fatherName the fatherName to set
	 */
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	/**
	 * @return the contactNumber
	 */
	public String getContactNumber() {
		return contactNumber;
	}
	/**
	 * @param contactNumber the contactNumber to set
	 */
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the studentMarkList
	 */
	public List<MarkBO> getStudentMarkList() {
		return studentMarkList;
	}
	/**
	 * @param studentMarkList the studentMarkList to set
	 */
	public void setStudentMarkList(List<MarkBO> studentMarkList) {
		this.studentMarkList = studentMarkList;
	}
	/**
	 * @return the clas
	 */
	public int getClas() {
		return clas;
	}
	/**
	 * @param clas the clas to set
	 */
	public void setClas(int clas) {
		this.clas = clas;
	}
	/**
	 * @return the section
	 */
	public String getSection() {
		return section;
	}
	/**
	 * @param section the section to set
	 */
	public void setSection(String section) {
		this.section = section;
	}
	
	

}
