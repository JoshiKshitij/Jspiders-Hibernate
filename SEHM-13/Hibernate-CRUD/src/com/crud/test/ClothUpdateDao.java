package com.crud.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClothUpdateDao {

	public static void main(String[] args) {

		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		ClothDto cl = session.get(ClothDto.class, 1);
		System.out.println(cl);

		if (cl != null) {
			cl.setPrice(44500);
			session.update(cl);
		}
		else {
			System.out.println(" Pk Not Available");
		}

		tx.commit();

		session.close();
		sf.close();

		System.out.println("App end");

	}

}
