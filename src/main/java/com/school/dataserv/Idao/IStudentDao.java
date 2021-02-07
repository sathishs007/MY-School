package com.school.dataserv.Idao;

import java.util.List;

import com.school.dataserv.domain.StudentVO;
import com.school.dataserv.exception.MySchoolException;
import com.school.dataserv.model.StudenBO;

public interface IStudentDao {
public void createStudent(List<StudentVO>studentList) throws MySchoolException;
public StudenBO getStudentDetails(int rollNumber) throws MySchoolException;
public List<StudenBO>getStudentDetailsList(int cls,String section) throws MySchoolException;
}
