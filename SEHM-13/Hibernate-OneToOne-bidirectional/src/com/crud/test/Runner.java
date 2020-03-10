package com.crud.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Runner {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();

		// data to be stored
		Husband ramalal = new Husband();
		ramalal.setAge(26);
		ramalal.setName("Ram Lal");

		Wife sitalila = new Wife();
		sitalila.setAge(26);
		sitalila.setName("Sita Lila");

		// relation for hibernate for FK
		ramalal.setWife(sitalila);
		sitalila.setHusband(ramalal);

		// persistance logic
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(sitalila);
		session.save(ramalal);
		tx.commit();
		session.close();
		sessionFactory.close();
		
		
		
	}
}
