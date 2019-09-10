package com.singleton.factory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Runner {
	
	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Student ram = new Student();
		ram.setName("ram");
		ram.setAge(19);
		
		Address ramAdd = new Address();
		ramAdd.setCity("ludhiana");
		ramAdd.setState("punjab");
		ramAdd.setPincode("141001");
		
		ram.setAddress(ramAdd);
		
		session.save(ram);
		
		tx.commit();
		
		
	}

}
