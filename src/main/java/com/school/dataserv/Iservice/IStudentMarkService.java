package com.school.dataserv.Iservice;

import org.springframework.web.multipart.MultipartFile;

import com.school.dataserv.exception.MySchoolException;

public interface IStudentMarkService {
	public String createStudentMark(MultipartFile file) throws MySchoolException;
}
