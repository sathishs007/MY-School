package com.school.dataserv.Idao;

import com.school.dataserv.domain.LoginVO;
import com.school.dataserv.exception.MySchoolException;

public interface ILoginDao {
	public LoginVO getLogin(final int id)throws MySchoolException;
}
