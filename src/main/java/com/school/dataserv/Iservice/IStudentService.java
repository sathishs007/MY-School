package com.school.dataserv.Iservice;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.school.dataserv.exception.MySchoolException;
import com.school.dataserv.model.StudenBO;

public interface IStudentService {
public String createStudent(MultipartFile file)throws MySchoolException;
public StudenBO getStudentDetails(int rollNumber)throws MySchoolException;
public List<StudenBO> getStudentDetailsList(int cls, String section)throws MySchoolException;
}
