package com.embedded.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class HQL_Rnner {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		// select car.* from table_cartoon as car
		Query query = session.createQuery("select car from CartoonDto as car where rating = :rat ");

		query.setParameter("rat", "4");
		
		List<CartoonDto> list = query.list();

		// sql -> select c.* from table_cartoon c where rating = ?;

		// Hql -> select c from CartoonDto c where rating = :r ;
		// Hql -> select c from CartoonDto c where rating = ? ;
		for (CartoonDto car : list) {
			System.out.println(car);
		}

		transaction.commit();
		factory.close();
		session.close();

	}
}
