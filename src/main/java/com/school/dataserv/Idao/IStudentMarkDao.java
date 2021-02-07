package com.school.dataserv.Idao;

import java.util.List;

import com.school.dataserv.domain.MarkVO;
import com.school.dataserv.exception.MySchoolException;

public interface IStudentMarkDao {
	public void createStudentMark(List<MarkVO>studentMarkList) throws MySchoolException;
}
