package com.embedded.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class RUnner {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session =  factory.openSession();
		Transaction transaction = session.beginTransaction();
		/*
		 * Employee emp = new Employee(); //emp.setId(1); emp.setDept("testing");
		 * emp.setName("dhiru");
		 * 
		 * Address address = new Address(); address.setCity("bangalore");
		 * address.setPincode("560097"); address.setState("KA");
		 * address.setStreet("98 soft road");
		 * 
		 * emp.setAddress(address);
		 */
		//session.save(emp);
		
		
		/*
		 * Employee employee = session.get(Employee.class, 1); Employee employee1 =
		 * session.get(Employee.class, 2); Employee employee2 =
		 * session.get(Employee.class, 1); Employee employee3 =
		 * session.get(Employee.class, 1);
		 */
		
		
		
		
		
		
		
	//	System.out.println(employee);
		
		
		//transaction.commit();
	//	factory.close();
	//	session.close();
		
	
	}
}
