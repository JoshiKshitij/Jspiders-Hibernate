package com.embedded.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class RUnner {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session =  factory.openSession();
		Transaction transaction = session.beginTransaction();

		Employee emp = new Employee();
		//emp.setId(1);
		emp.setDept("development");
		emp.setName("yumraj");
		
		Address address = new Address();
		address.setCity("ludhiana");
		address.setPincode("141007");
		address.setState("pubjab");
		address.setStreet("5 mains");
		
		emp.setAddress(address);

		session.save(emp);
		transaction.commit();
		factory.close();
		session.close();
		
	
	}
}
