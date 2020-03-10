package com.crud.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Fetch {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		
		//Wife wife = session.get(Wife.class, 1);
		//System.out.println(wife );
		
		Husband hus = session.get(Husband.class, 1);
		System.out.println(hus );
		session.close();
		sessionFactory.close();
		 
		
		
	}
}
