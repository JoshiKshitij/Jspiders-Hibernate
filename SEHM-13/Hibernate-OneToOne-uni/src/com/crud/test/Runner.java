package com.crud.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Runner {

	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.buildSessionFactory();

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		BoyDto ram = new BoyDto();
		ram.setName("Ram sharma");
		ram.setAge(28);

		GirlDto sita = new GirlDto();
		sita.setAge(24);
		sita.setName("Sita");

		// relation in java
		ram.setGirl(sita);

		session.save(ram);
		session.save(sita);

		tx.commit();
		session.close();
		factory.close();

	}
}
