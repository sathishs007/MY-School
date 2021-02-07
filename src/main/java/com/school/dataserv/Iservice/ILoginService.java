package com.school.dataserv.Iservice;

import com.school.dataserv.exception.MySchoolException;
import com.school.dataserv.model.JwtUser;

public interface ILoginService {
public JwtUser getLogin(JwtUser user)throws MySchoolException;
}
