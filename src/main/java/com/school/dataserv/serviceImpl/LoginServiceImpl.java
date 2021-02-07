package com.school.dataserv.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.dataserv.Idao.ILoginDao;
import com.school.dataserv.Iservice.ILoginService;
import com.school.dataserv.domain.LoginVO;
import com.school.dataserv.exception.MySchoolException;
import com.school.dataserv.model.JwtUser;
import com.school.dataserv.utils.EncodeAndDecode;

@Service
public class LoginServiceImpl implements ILoginService{
	@Autowired
ILoginDao iLoginDao;
	//@Autowired
	//com.school.dataserv.security.JwtGenerator generator;
	
	@Override
	public JwtUser getLogin(JwtUser user) throws MySchoolException {
		LoginVO vo= iLoginDao.getLogin(user.getId());
		JwtUser bo=new JwtUser();
		if(vo!=null&&EncodeAndDecode.decodePassword(vo.getPassword()).equalsIgnoreCase(user.getPassword())) {
			bo=mapLogin(vo);
			//bo.setToken(generator.generate(bo));
		}else {
			
			bo.setMessage(vo!=null?"Password not valid":"userName notvalid");
		}
		return bo;
	}
	 public JwtUser mapLogin(final LoginVO loginObj) {
	        final JwtUser loginBO = new JwtUser();
	        loginBO.setId(loginObj.getId());
	        loginBO.setUserName(loginObj.getName());
	        loginBO.setRole(loginObj.getRole());
	        loginBO.setMessage("Success");
	        return loginBO;

	    }
	
}
