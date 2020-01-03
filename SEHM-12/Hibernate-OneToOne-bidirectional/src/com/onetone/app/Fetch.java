package com.onetone.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import singleton.app.HibernteUtil;

public class Fetch {

	public static void main(String[] args) {
		
		SessionFactory factory = HibernteUtil.buildSessionFactory();
	
		Session session = factory.openSession();
		
		Student student = session.get(Student.class , new Integer(1));
		
		//Laptop laptop = session.get(Laptop.class, new Integer(1));
		session.close();
		factory.close();
		
	}
}
