package com.onetomany.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class FetchRunner {
	
	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		
		Session session = sf.openSession();
		
		Person b1 = session.get(Person.class, 5 );
		Home g1 = session.get(Home.class, 1);
	//	System.out.println(b1);
		
		System.err.println(g1);
		
	}

}
