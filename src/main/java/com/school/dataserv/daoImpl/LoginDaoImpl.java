package com.school.dataserv.daoImpl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.school.dataserv.Idao.ILoginDao;
import com.school.dataserv.domain.LoginVO;
import com.school.dataserv.exception.MySchoolException;
@Repository
public class LoginDaoImpl implements ILoginDao{
    @Autowired
    private SessionFactory sessionFactory;
	@Override
	public LoginVO getLogin(int id) throws MySchoolException {
		 final Session session = sessionFactory.openSession();
	        LoginVO loginObj = null;
	        try {
	            final Criteria criteria = session.createCriteria(LoginVO.class).add(Restrictions.eq("id", id));
	            if (criteria.list().size() != 0) {
	                loginObj = (LoginVO) criteria.list().get(0);
	            }
	        }
	        finally {
	            session.clear();
	            session.close();
	        }
	        return loginObj;
	}

}
