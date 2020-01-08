package com.hql.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import singleton.app.HibernteUtil;

public class FetchUsingHQL {
	
	public static void main(String[] args) {
		
		SessionFactory factory = HibernteUtil.buildSessionFactory();
		Session session = factory.openSession();
		
		// for DQL tranasction is not required
		
		// we need Query object to execute HQL
		//session.createQuery("HQl");
		
	//	Query<Student> query = 
	//			session.createQuery("from Student where name = 'Kshitij Joshi'");
		
		Query<Student> query = 
				session.createQuery("select std from Student std where name = 'Kshitij Joshi'");
		
		
		Student student = query.uniqueResult();
		System.out.println(student);
			
		
	}

}
