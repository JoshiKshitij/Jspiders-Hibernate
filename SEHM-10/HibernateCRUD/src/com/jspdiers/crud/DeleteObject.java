package com.jspdiers.crud;

import javax.persistence.EntityTransaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteObject {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Institute i103 = session.get(Institute.class, 103);
		session.delete(i103);
		
		transaction.commit();
	}

}
