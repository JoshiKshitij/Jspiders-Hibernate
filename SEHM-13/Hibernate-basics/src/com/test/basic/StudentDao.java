package com.test.basic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentDao {

	public static void main(String[] args) {
		System.out.println("App started");

		Configuration cfg = new Configuration();
		cfg.configure();
		
		System.out.println("Configuration done");
		System.out.println("create Session Factory");
		
		SessionFactory factory = cfg.buildSessionFactory();
		System.out.println("SessionFactory created");
		
		
		StudentDto sd = new StudentDto();
		sd.setName("BahuBali ");
		sd.setRollNo(1);
		sd.setStream("ece");
		
		// will be used for CRUD operation
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(sd);
		tx.commit();
		
		//close the resources
		session.close();
		factory.close();
		
		

	}

}
