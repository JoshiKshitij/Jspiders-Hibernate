package com.singleton.factory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Runner {
	
	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
	
		tx.commit();
		
		
	}

}
