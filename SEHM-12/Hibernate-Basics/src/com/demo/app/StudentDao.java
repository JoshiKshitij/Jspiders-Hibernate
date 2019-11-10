package com.demo.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentDao  {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		System.out.println("configuration done");
		
		System.out.println("building SessionFactory");
		SessionFactory factory = cfg .buildSessionFactory();
		System.out.println("SessionFactory built");
		
		// create session fro crud 
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		StudentDto Kshitij = new StudentDto();
		//ram.setId(1);
		Kshitij.setName("kshitij");
		Kshitij.setPercentage(41.11);
		Kshitij.setStream("ece");
		
		session.save(Kshitij);
		
		transaction.commit();
		
		
		
		
	}
	

}
