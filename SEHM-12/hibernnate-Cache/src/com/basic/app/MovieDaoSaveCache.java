package com.basic.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MovieDaoSaveCache {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		
		Transaction transaction = session.beginTransaction();
		
		MovieDto golmaal = new MovieDto();
		session.save(golmaal);
		
		golmaal.setName("golmaal");
		golmaal.setStars("****");
		
		
		transaction.commit();
		session.clear();
		session.close();
		
		
	}

}
