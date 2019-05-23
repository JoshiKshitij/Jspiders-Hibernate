package com.jspdiers.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchObject {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Institute institute = session.get(Institute.class, 0);
		
		
		
		System.out.println(institute);
		
		
		
		
		
	}

}
