package com.hql.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Runner {
	
	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		// dummy data for hql
		session.save(new Student(21, "Kshtiij"));
		session.save(new Student(20, "ram"));
		session.save(new Student(19, "sham"));
		session.save(new Student(20, "bharat"));
		
		tx.commit();
		
		
		
		
		
		
		
		
		
		
		
	}

}
