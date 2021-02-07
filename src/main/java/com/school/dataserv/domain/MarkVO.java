package com.school.dataserv.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student_mark_details")
public class MarkVO extends BasicVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1344306280994446363L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int mark_id;
	private int tamil;
	private int english;
	private int mathes;
	private int sciences;
	private int s_sci;
	private int total;
	private int sem;
	 @ManyToOne
	private StudentVO studentVO;
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
	 * @return the studentVO
	 */
	public StudentVO getStudentVO() {
		return studentVO;
	}
	/**
	 * @param studentVO the studentVO to set
	 */
	public void setStudentVO(StudentVO studentVO) {
		this.studentVO = studentVO;
	}
	
	
	

}
