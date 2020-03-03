package com.crud.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClothSaveDao {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();

		ClothDto jeans = new ClothDto();
		jeans.setBrand("levis");
		//jeans.setId(1);
		jeans.setPrice(3500.00);
		jeans.setType("jeans");
		jeans.setColor("black");
		 
		Transaction transaction = session.beginTransaction();
		session.save(jeans);
		transaction.commit();
		
		session.close();
		sf.close();
		
		
		
		
		
		
		
		
		
		
		System.out.println("App end");
		
		
	}
	
	
}
