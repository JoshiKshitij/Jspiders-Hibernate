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
		
		Vehicle duke390 = new Vehicle();
		duke390.setBrand("ktm");
		duke390.setModel("duke 390");
		duke390.setYear("2017");
		
		Engine r3Engine = new Engine();
		r3Engine.setBrand("yamaha");
		r3Engine.setCc("298");
		r3Engine.setHp("48");
		
		Engine dukeEngine = new Engine();
		dukeEngine.setBrand("ktm");
		dukeEngine.setCc("398");
		dukeEngine.setHp("43.8");
		
		// this will tell vehicale has a engine 
		r3.setEngine(r3Engine);
		r3Engine.setVehicle(r3);
	
		duke390.setEngine(dukeEngine);
		dukeEngine.setVehicle(duke390);
		
		session.save(r3);
		session.save(r3Engine);
		
		session.save(duke390);
		session.save(dukeEngine);
		
	
		transaction.commit();
		
		
		
		
		
		
		
	
	}
}
