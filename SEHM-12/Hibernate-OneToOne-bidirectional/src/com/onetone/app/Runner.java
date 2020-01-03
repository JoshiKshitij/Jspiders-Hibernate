package com.onetone.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import singleton.app.HibernteUtil;

public class Runner {

	public static void main(String[] args) {
		
		SessionFactory factory = HibernteUtil.buildSessionFactory();
		
		Student narayan = new Student();
		narayan.setName("narayan");
		narayan.setBranch("EEE");
		
		
		Laptop dell = new Laptop();
		dell.setBrand("Dell");
		dell.setModel("XPS 15");
		
		// relatonsship
		dell.setStudent(narayan);
		narayan.setLaptop(dell);
		
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(dell);
		session.save(narayan);
		
		transaction.commit();
		session.close();
		factory.close();
		
	}
}
