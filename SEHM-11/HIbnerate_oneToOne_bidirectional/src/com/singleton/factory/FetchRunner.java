package com.singleton.factory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class FetchRunner {
	
	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		
		Session session = sf.openSession();
		
		Boy b1 = session.get(Boy.class, 5 );
		Girl g1 = session.get(Girl.class, 1);
	//	System.out.println(b1);
		
		System.err.println(g1);
		
	}

}
