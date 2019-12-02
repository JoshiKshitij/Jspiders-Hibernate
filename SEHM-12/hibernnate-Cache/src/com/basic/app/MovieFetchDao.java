package com.basic.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MovieFetchDao {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		System.out.println(session.get(MovieDto.class, new Integer(1)));
		System.out.println(session.get(MovieDto.class, new Integer(1)));
		System.out.println(session.get(MovieDto.class, new Integer(1)));
		System.out.println(session.get(MovieDto.class, new Integer(1)));
		System.out.println(session.get(MovieDto.class, new Integer(2)));
		System.out.println(session.get(MovieDto.class, new Integer(1)));
		System.out.println(session.get(MovieDto.class, new Integer(1)));
		System.out.println(session.get(MovieDto.class, new Integer(1)));
		
	}

}
