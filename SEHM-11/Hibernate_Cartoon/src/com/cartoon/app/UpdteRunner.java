package com.cartoon.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdteRunner {

	public static void main(String[] args) {

		// 1st step is configure the app
		Configuration cfg = new Configuration();
		cfg.configure();

		SessionFactory factory = cfg.buildSessionFactory();

		// create session and do CRUD operations
		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();
		
		Cartoons cartoonFromDb = session.get(Cartoons.class, 1);
		
		cartoonFromDb.setCartoonName("IBen 10");
		cartoonFromDb.setFavChar("Ben");
	
		session.update(cartoonFromDb);
		transaction.commit();

	}

}
