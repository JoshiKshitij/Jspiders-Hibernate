package com.crud.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Runner {
	
		
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
		
		CountryDto usa = new CountryDto();
		usa.setName("USA");
		
		PrimeMinisterDto trump = new PrimeMinisterDto();
		trump.setAge(70);
		trump.setBecamePmIn("2014");
		trump.setName("Trump");
	
		// java relationship for hibernate
	//	modi.setCountry(india);
		trump.setCountry(usa);
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(trump);
		session.save(usa);
		
		tx.commit();
		session.close();
		sessionFactory.close();
		
		
		
		
	}
}
