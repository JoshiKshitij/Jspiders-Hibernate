package com.basic.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchDao {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		// we are saving Dtos so we need tansaction object
		StudentDto father = session.get(StudentDto.class, new Integer(1));
	///	System.out.println(father.getListOfSons());
		
		
	}
	

}
