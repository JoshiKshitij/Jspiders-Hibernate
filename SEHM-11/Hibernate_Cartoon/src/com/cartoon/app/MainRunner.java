package com.cartoon.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainRunner {

	public static void main(String[] args) {

		// 1st step is configure the app
		Configuration cfg = new Configuration();
		cfg.configure();

		// 2 and step
		// make a connection
		SessionFactory factory = cfg.buildSessionFactory();

		// create session and do CRUD operations
		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		Cartoons tomAndJerry = new Cartoons();
		

		
		tomAndJerry.setCartoonName(" Tom And Jerry ");
		tomAndJerry.setFavChar("Tom");

		Cartoons naruto = new Cartoons();

		naruto.setCartoonName(" NAruto ");
		naruto.setFavChar("kakashi");

		Cartoons onePiece = new Cartoons();

		onePiece.setCartoonName(" one piece ");
		onePiece.setFavChar("luffy");

		session.save(tomAndJerry);
		session.save(naruto);
		session.save(onePiece);

		transaction.commit();

	}

}
