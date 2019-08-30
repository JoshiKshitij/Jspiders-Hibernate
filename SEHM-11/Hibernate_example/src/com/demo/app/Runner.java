package com.demo.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Runner {

	public static void main(String[] args) {
		
		System.out.println("pp started");
		// this class will configure your app
		Configuration cfg = new Configuration();
		cfg.configure();
		
		// making connection
		SessionFactory factory = cfg.buildSessionFactory();
		
		// crud operation
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Student rahul = new Student();
		rahul.setRollNo(1);
		rahul.setName("rahul");
		rahul.setStream("ece");
		
		session.save(rahul);
		
		transaction.commit();
		
		System.out.println("app ended");
		

	}

}
