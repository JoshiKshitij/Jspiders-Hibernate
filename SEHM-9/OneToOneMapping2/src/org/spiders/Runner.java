package org.spiders;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.spiders.HibernateUtil;

public class Runner {

	public static void main(String[] args) {
		
		// make connection
		// built session
		// mapping classes to table
		// 2nd level cache maintainer
		SessionFactory factory = HibernateUtil.getFactory();
		
		// crud operation
		// 1st level cache maintainer
		Session session = factory.openSession();
		/*
		 * session.beginTransaction();
		 * 
		 * Vehicle duke200 = new Vehicle(); duke200.setMake("ford");
		 * duke200.setModel("figo"); duke200.setLicencePlate("ka 11 1212");
		 * 
		 * 
		 * Engine engine = new Engine(); engine.setCc("1400 cc"); engine.setHp("80 hp");
		 * engine.setVehicle(duke200);
		 * 
		 * 
		 * session.save(duke200); session.save(engine);
		 * 
		 * session.getTransaction().commit();
		 */
		//Engine engine1 = session.get(Engine.class, new Integer(1));
		 Vehicle vehicle = session.get(Vehicle.class, new Integer(1));
		 
		System.out.println(vehicle);
		session.close();
	}
}
