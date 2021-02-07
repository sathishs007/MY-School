package com.school.dataserv.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.school.dataserv.Idao.IStudentDao;
import com.school.dataserv.Iservice.IStudentService;
import com.school.dataserv.domain.StudentVO;
import com.school.dataserv.exception.MySchoolException;
import com.school.dataserv.model.StudenBO;
import com.school.dataserv.utils.XLsReader;
@Service
public class StudentServiceImpl implements IStudentService{
    @Autowired
	XLsReader xLsReader;
    @Autowired
    IStudentDao iStudentDao;
    
	@Override
	public String createStudent(MultipartFile file) throws MySchoolException{
		String status="SUCCESS";
		try {
		List<StudentVO> studentList=xLsReader.getStudentDetails(file);
		iStudentDao.createStudent(studentList);
		}catch(Exception ex) {
			throw new MySchoolException(ex.getMessage());
		}
		return status;
	}

	@Override
	public StudenBO getStudentDetails(int rollNumber) throws MySchoolException {
		return 	iStudentDao.getStudentDetails(rollNumber);
	}

	@Override
	public List<StudenBO> getStudentDetailsList(int cls, String section) throws MySchoolException{
		return iStudentDao.getStudentDetailsList(cls, section);
	}

	

}
