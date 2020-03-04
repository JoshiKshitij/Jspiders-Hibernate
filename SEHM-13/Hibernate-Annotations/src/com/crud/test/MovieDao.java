package com.crud.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MovieDao {

	public static void main(String[] args) {
		
	//	Session session = new Configuration().configure().buildSessionFactory().openSession();
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		
	}
	
}
