package com.cartoon.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchRunner {

	public static void main(String[] args) {

		// 1st step is configure the app
		Configuration cfg = new Configuration();
		cfg.configure();

		// 2 and step
		// make a connection
		SessionFactory factory = cfg.buildSessionFactory();

		// create session and do CRUD operations
		Session session = factory.openSession();
	
		Cartoons cartoons = session.get(Cartoons.class, 2);
		System.out.println(cartoons);
		
		
	}

}







