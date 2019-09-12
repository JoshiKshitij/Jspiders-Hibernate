package com.hql.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class FetchRunner {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session session = sf.openSession();

		// Query query = session.createQuery("hql");

		Query<Student> query = session.createQuery("from Student where name = 'ram'" );
		List<Student> list = query.list();
		System.out.println(list);
		
		
		Query<Student> query1 = session.createQuery("from Student where name = ?" );
		query1.setString(1, "ram");
		
	
		List<Student> list2 = query1.list();
		System.out.println(list2);
		
		

	}

}
