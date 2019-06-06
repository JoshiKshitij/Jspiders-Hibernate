package com.embedded.app;

import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ClienntData {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		for (int i = 0; i < 10; i++) {
			int incremnt = 65;
			char name = (char) (incremnt + i);
			Random ran = new Random();
			int rating = ran.nextInt(4) + 1;
			CartoonDto cartoon = new CartoonDto(name + "", rating + "");

		//	CartoonDto newCartoon = new CartoonDto((char) (incremnt + i) + "", 
		//			(new Random().nextInt(4) + 1) + "");
			session.save(cartoon);
		}
		transaction.commit();
		factory.close();
		session.close();
	}

}
