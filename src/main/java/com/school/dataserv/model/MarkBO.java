package com.school.dataserv.model;

import java.io.Serializable;

public class MarkBO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5449408575801632037L;
	
	private int mark_id;
	private int tamil;
	private int english;
	private int mathes;
	private int sciences;
	private int s_sci;
	private int total;
	private int sem;
	private StudenBO studenBO;
	
	/**
	 * @return the mark_id
	 */
	public int getMark_id() {
		return mark_id;
	}
	/**
	 * @param mark_id the mark_id to set
	 */
	public void setMark_id(int mark_id) {
		this.mark_id = mark_id;
	}
	/**
	 * @return the tamil
	 */
	public int getTamil() {
		return tamil;
	}
	/**
	 * @param tamil the tamil to set
	 */
	public void setTamil(int tamil) {
		this.tamil = tamil;
	}
	/**
	 * @return the english
	 */
	public int getEnglish() {
		return english;
	}
	/**
	 * @param english the english to set
	 */
	public void setEnglish(int english) {
		this.english = english;
	}
	/**
	 * @return the mathes
	 */
	public int getMathes() {
		return mathes;
	}
	/**
	 * @param mathes the mathes to set
	 */
	public void setMathes(int mathes) {
		this.mathes = mathes;
	}
	/**
	 * @return the sciences
	 */
	public int getSciences() {
		return sciences;
	}
	/**
	 * @param sciences the sciences to set
	 */
	public void setSciences(int sciences) {
		this.sciences = sciences;
	}
	/**
	 * @return the s_sci
	 */
	public int getS_sci() {
		return s_sci;
	}
	/**
	 * @param s_sci the s_sci to set
	 */
	public void setS_sci(int s_sci) {
		this.s_sci = s_sci;
	}
	/**
	 * @return the total
	 */
	public int getTotal() {
		return total;
	}
	/**
	 * @param total the total to set
	 */
	public void setTotal(int total) {
		this.total = total;
	}
	/**
	 * @return the sem
	 */
	public int getSem() {
		return sem;
	}
	/**
	 * @param sem the sem to set
	 */
	public void setSem(int sem) {
		this.sem = sem;
	}
	/**
	 * @return the studenBO
	 */
	public StudenBO getStudenBO() {
		return studenBO;
	}
	/**
	 * @param studenBO the studenBO to set
	 */
	public void setStudenBO(StudenBO studenBO) {
		this.studenBO = studenBO;
	}
	
	

}
