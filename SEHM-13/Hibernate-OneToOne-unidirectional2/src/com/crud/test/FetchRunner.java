package com.crud.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class FetchRunner {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();

		Session session = sessionFactory.openSession();

		PrimeMinisterDto pm = session.get(PrimeMinisterDto.class, 1);
		System.out.println(pm);
		
	//	CountryDto country = session.get(CountryDto.class, 1);
	//	System.out.println(country);
		
		session.close();
		sessionFactory.close();

	}
}
