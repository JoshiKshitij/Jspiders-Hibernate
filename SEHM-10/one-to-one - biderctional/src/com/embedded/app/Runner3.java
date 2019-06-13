package com.embedded.app;

import org.hibernate.Session;

import com.embedded.app.dto.Engine;
import com.embedded.app.dto.Vehicle;

public class Runner3 {

	public static void main(String[] args) {

		Session session = HibernateUtils.getSessionFactory().openSession();
		//Engine engine = session.get(Engine.class, 1);
		
		// this line means
		// Engine engine = new Engine();
		// engine.setId(1);
		 Engine engine = session.load(Engine.class, 1);

		System.out.println("object loaded");

		try {
			Thread.sleep(3000);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(engine.getBrand());

	}

}
