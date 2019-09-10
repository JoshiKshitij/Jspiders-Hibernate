package com.singleton.factory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Runner {
	
	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Boy b1 = new Boy();
		b1.setName("b1");
		b1.setAge(21);
		
		Girl g1 = new Girl();
		g1.setName("g1");
		g1.setAge(21);
		
		b1.setGirl(g1);
		g1.setBoy(b1);
		
		session.save(g1);
		session.save(b1);
		tx.commit();
		
		
	}

}
