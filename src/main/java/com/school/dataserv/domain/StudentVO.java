package com.school.dataserv.domain;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "student")
public class StudentVO extends BasicVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1037103230272664876L;
	@Id
	private Integer rollNumber;
	private String studentName;
	private String fatherName;
	private String contactNumber;
	private int clas;
	private String section;
	private String address;
	@OneToMany(mappedBy = "studentVO",fetch = FetchType.EAGER)
	private List<MarkVO>mark_details;
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
	 * @return the mark_details
	 */
	public List<MarkVO> getMark_details() {
		return mark_details;
	}
	/**
	 * @param mark_details the mark_details to set
	 */
	public void setMark_details(List<MarkVO> mark_details) {
		this.mark_details = mark_details;
	}
	
	

}
