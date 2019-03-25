package org.spiders;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.query.Query;

import com.spiders.HibernateUtil;

public class SchoolDao {

	SessionFactory factory = HibernateUtil.getFactory();

	public SchoolDto getSchoolById(int pk) {

		Session session = factory.openSession();
		Query query = session.createQuery("from SchoolDto where id = :abc");
		query.setInteger("abc", pk);
		Object uniqueResult = query.uniqueResult();
		SchoolDto school = (SchoolDto) uniqueResult;
		session.close();
		return school;
	}
	
	
	 public Object []getSchoolNameAndBoardById(int pk){
		
		Session session = factory.openSession();

		Query query = session.createQuery("select school.schoolName , school.board "
				+ " from SchoolDto school "
				+ " where school.id = :id ");
		
		query.setInteger("id", 1);
		
		 Object[] obj = (Object[])query.uniqueResult();
		
		 session.close();
		 return obj;
	}
	 
	 public List<Object[] > getAllSchoolNamesAndBoard(){
		
		 	Session session = factory.openSession();

			Query query = session.createQuery("select school.schoolName , school.board " + " from SchoolDto school ");

			List<Object[]> list = query.list();

			for (Object[] object : list) {
				String schoolName = (String) object[0];
				String board = (String) object[1];
				
				
				System.out.println("school - >>" +schoolName +" has " + board + " board");
			}
			
			
			session.close();
			
			return list;
	 }
	 
	 public int deleteByName(String name){
			
		 Session session = HibernateUtil.getFactory().openSession();

			session.beginTransaction();
			Query query = session.createQuery("delete from SchoolDto where schoolName = :abc");
			query.setString("abc", "dav");
			int i = query.executeUpdate();
			
			session.getTransaction().commit();
			
			session.close();
			
			return i;
			
	 }
	 
	 
	 
	 
	 
	 
	

}
