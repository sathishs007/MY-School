package com.school.dataserv.daoImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.school.dataserv.Idao.IStudentDao;
import com.school.dataserv.domain.StudentVO;
import com.school.dataserv.exception.MySchoolException;
import com.school.dataserv.model.MarkBO;
import com.school.dataserv.model.StudenBO;
@Repository
public class StudentDaoImpl implements IStudentDao{
	 @Autowired
	    private SessionFactory sessionFactory;
	@Override
	public void createStudent(List<StudentVO> studentList) throws MySchoolException {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction transaction=null;
		try {
			 session=sessionFactory.openSession();
			  transaction = session.beginTransaction();
			 for(StudentVO vo:studentList) {
				 vo.setCreateBy("SYSTEM");
				 vo.setUpdateBy("SYSTEM");
				 vo.setCreatedDate(LocalDate.now());
				 vo.setUpdatedDate(LocalDate.now());
				 session.save(vo);
			 }
		}catch(Exception e) {
			throw new MySchoolException("some Student id already present");
		}
		finally {
			 transaction.commit();
			session.clear();
            session.close();
            //sessionFactory.close();
		}
	}
	@Override
	public StudenBO getStudentDetails(int rollNumber) throws MySchoolException{
		Session session=null;
		StudenBO bo=null;
		try {
			session=sessionFactory.openSession();
			final Criteria criteria =session.createCriteria(StudentVO.class);
			criteria.add(Restrictions.eq("rollNumber", rollNumber));
			bo=convertVOtoBO((StudentVO) criteria.list().get(0));
			
		}catch(Exception e) {
			
		}
		finally {
			// transaction.commit();
			session.clear();
            session.close();
           // sessionFactory.close();
		}
		return bo;
	}

	public StudenBO convertVOtoBO(StudentVO vo) {
		StudenBO bo=null;
		if(vo!=null) {
		 bo=new StudenBO();
		bo.setRollNumber(vo.getRollNumber());
		bo.setStudentName(vo.getStudentName());
		bo.setFatherName(vo.getFatherName());
		bo.setContactNumber(vo.getContactNumber());
		bo.setClas(vo.getClas());
		bo.setSection(vo.getSection());
		bo.setAddress(vo.getAddress());
		 List<MarkBO>studentMarkList=new ArrayList<MarkBO>();
		vo.getMark_details().forEach(markVo->{
			MarkBO markBo=new MarkBO();
			markBo.setTamil(markVo.getTamil());
			markBo.setEnglish(markVo.getEnglish());
			markBo.setMathes(markVo.getMathes());
			markBo.setSciences(markVo.getSciences());
			markBo.setS_sci(markVo.getS_sci());
			markBo.setTotal(markVo.getTotal());
			markBo.setSem(markVo.getSem());
			studentMarkList.add(markBo);
		});
		bo.setStudentMarkList(studentMarkList);
		}
		return bo;
		
	}
	
	public List<StudenBO> convertVOtoBOList(List<StudentVO> voList) {
		List<StudenBO>getStudentDetailsList=new ArrayList<>();
		voList.forEach(vo->{
		StudenBO bo=new StudenBO();
		bo.setRollNumber(vo.getRollNumber());
		bo.setStudentName(vo.getStudentName());
		bo.setFatherName(vo.getFatherName());
		bo.setContactNumber(vo.getContactNumber());
		bo.setClas(vo.getClas());
		bo.setSection(vo.getSection());
		bo.setAddress(vo.getAddress());
		 List<MarkBO>studentMarkList=new ArrayList<MarkBO>();
		vo.getMark_details().forEach(markVo->{
			MarkBO markBo=new MarkBO();
			markBo.setTamil(markVo.getTamil());
			markBo.setEnglish(markVo.getEnglish());
			markBo.setMathes(markVo.getMathes());
			markBo.setSciences(markVo.getSciences());
			markBo.setS_sci(markVo.getS_sci());
			markBo.setTotal(markVo.getTotal());
			markBo.setSem(markVo.getSem());
			studentMarkList.add(markBo);
		});
		bo.setStudentMarkList(studentMarkList);
		getStudentDetailsList.add(bo);
		});
		return getStudentDetailsList;
		
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<StudenBO> getStudentDetailsList(int cls, String section) throws MySchoolException{
		Session session=null;
		 List<StudenBO> getStudentDetailsList=null;
		try {
			session=sessionFactory.openSession();
			final Criteria criteria =session.createCriteria(StudentVO.class);
			criteria.add(Restrictions.eq("clas", cls));
			criteria.add(Restrictions.eq("section", section));
			getStudentDetailsList=convertVOtoBOList(criteria.list());
			
		}catch(Exception e) {
			
		}
		finally {
			// transaction.commit();
			session.clear();
            session.close();
           // sessionFactory.close();
		}
		return getStudentDetailsList;
	}
}
