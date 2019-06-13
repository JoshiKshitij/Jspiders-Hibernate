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
		
		
		// parent
		Vehicle duke390 = new Vehicle();
		duke390.setBrand("ktm");
		duke390.setModel("duke 390");
		duke390.setYear("2017");
		
		// child
		Engine dukeEngine = new Engine();
		dukeEngine.setBrand("ktm");
		dukeEngine.setCc("398");
		dukeEngine.setHp("43.8");
		
		// this will tell vehicale has a engine 
	
		duke390.setEngine(dukeEngine);
		dukeEngine.setVehicle(duke390);		
	
		//session.save(dukeEngine);
		//session.save(duke390);
	
		session.persist(dukeEngine);
		transaction.commit();
	
	
	}
}
