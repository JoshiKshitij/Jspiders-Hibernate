package com.embedded.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.embedded.app.dto.Engine;
import com.embedded.app.dto.Vehicle;

public class Runner {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session =  factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		
		Vehicle r3 = new Vehicle();
		r3.setBrand("yamaha");
		r3.setModel("r3");
		r3.setYear("2019");
		
		Engine r3Engine = new Engine();
		r3Engine.setBrand("yamaha");
		r3Engine.setCc("298");
		r3Engine.setHp("48");
		
		r3.setEngine(r3Engine);
		
		session.save(r3);
		session.save(r3Engine);
	
		transaction.commit();
		
		
		
		
		
		
		
	
	}
}
