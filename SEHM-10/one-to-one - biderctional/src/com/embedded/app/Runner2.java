package com.embedded.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.embedded.app.dto.Engine;
import com.embedded.app.dto.Vehicle;

public class Runner2 {
	public static void main(String[] args) {

		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();

		// try commenting each fetch stateent one by one and see the output
		Vehicle vehicle1 = session.get(Vehicle.class, 1);
		Engine engine1 = session.get(Engine.class, 1);

		System.out.println( vehicle1  + ""+ vehicle1.getEngine());
		System.out.println(engine1 + " " + engine1.getVehicle());

	}
}
