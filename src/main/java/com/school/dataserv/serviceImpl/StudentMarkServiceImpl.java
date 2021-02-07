package com.school.dataserv.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.school.dataserv.Idao.IStudentMarkDao;
import com.school.dataserv.Iservice.IStudentMarkService;
import com.school.dataserv.domain.MarkVO;
import com.school.dataserv.exception.MySchoolException;
import com.school.dataserv.utils.XLsReader;
@Service
public class StudentMarkServiceImpl implements IStudentMarkService{
    @Autowired
	XLsReader xLsReader;
    @Autowired
    IStudentMarkDao iStudentMarkDao;
	@Override
	public String createStudentMark(MultipartFile file) throws MySchoolException {
		String status="SUCCESS";
		try {
		List<MarkVO> studentMarkList=xLsReader.getStudentMarkDetails(file);
		iStudentMarkDao.createStudentMark(studentMarkList);
		}catch(MySchoolException ex) {
			status="FAILURE";	
		}
		return status;
	}

	

}
