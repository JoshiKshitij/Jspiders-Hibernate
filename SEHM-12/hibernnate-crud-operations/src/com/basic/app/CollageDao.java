package com.basic.app;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CollageDao {

	private SessionFactory fatory = HibernateUtil.getSessionFactory();
	
	// save return the pk created by hibernate
	public Serializable saveCollage(CollageDto collage) {
		
		Session session = fatory.openSession();
		Transaction transaction = session.beginTransaction();
		Serializable pk = session.save(collage);
		transaction.commit();
		 
		// close is used to close the session
		// as session internally uses JDBC Connection object
		// and by default there are only 20 Connection objects
		session.close();
		
		return pk;
	}

	public void updateCollage(CollageDto collage) {
		
		int pk = collage.getId();
		
		
		Session session = fatory.openSession();
		Transaction transaction = session.beginTransaction();
	
		CollageDto collageFromDb = session.get(CollageDto.class, new Integer(pk));
		collageFromDb.setName(collage.getName());
		collageFromDb.setNoOfStudenrts(collage.getNoOfStudenrts());
		collageFromDb.setNoOfTeachers(collage.getNoOfTeachers());
		collageFromDb.setAddress(collage.getAddress());
		
		session.update(collageFromDb);
		
		transaction.commit();
		session.close();
		
		
		

	}

	public void deleteCollage(int pk) {
		Session session = fatory.openSession();
		Transaction transaction = session.beginTransaction();
		CollageDto collage = session.get(CollageDto.class, new Integer(pk));
		session.delete(collage);
		transaction.commit();
		session.close();
	}

	public CollageDto getCollage(int pk) {
		
		Session session = fatory.openSession();
		CollageDto collage = session.get(CollageDto.class, new Integer(pk));
		session.close();
		return collage;
	}

}
