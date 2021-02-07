package com.school.dataserv.daoImpl;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.school.dataserv.Idao.IStudentMarkDao;
import com.school.dataserv.domain.MarkVO;
import com.school.dataserv.exception.MySchoolException;
@Repository
public class StudentMarkDaoImpl implements IStudentMarkDao{
	 @Autowired
	    private SessionFactory sessionFactory;
	@Override
	public void createStudentMark(List<MarkVO> studentMarkList) throws MySchoolException{
		Session session=null;
		Transaction transaction=null;
		try {
			 session=sessionFactory.openSession();
			  transaction = session.beginTransaction();
			 for(MarkVO vo:studentMarkList) {
				 vo.setCreateBy("SYSTEM");
				 vo.setUpdateBy("SYSTEM");
				 vo.setCreatedDate(LocalDate.now());
				 vo.setUpdatedDate(LocalDate.now());
				 session.save(vo);
			 }
		}catch(Exception e) {
			
		}
		finally {
			 transaction.commit();
			session.clear();
            session.close();
            //sessionFactory.close();
		}
		
	}

}
