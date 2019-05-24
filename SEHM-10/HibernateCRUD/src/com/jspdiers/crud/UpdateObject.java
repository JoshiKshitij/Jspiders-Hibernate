package com.jspdiers.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateObject {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Institute ins = session.get(Institute.class, 100);
		System.out.println(ins);
		
		if(ins != null) {
			ins.setName("spring");
			ins.setFee(1000);
			session.update(ins);	
		}
		
		Institute ins1 = session.get(Institute.class, 100);
		System.out.println(ins1);		
		
		transaction.commit();
		
	}
	
}
