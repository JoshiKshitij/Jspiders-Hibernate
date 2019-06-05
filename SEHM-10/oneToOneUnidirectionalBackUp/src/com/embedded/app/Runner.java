package com.embedded.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.embedded.app.dto.Mobile;
import com.embedded.app.dto.SimCard;

public class Runner {
	public static void main(String[] args) {

		SessionFactory factory = HibernateUtils.getSessionFactory();

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();
		
		Mobile mobile = new Mobile();
		mobile.setBatterySize("3300 mah");
		mobile.setColor("red");
		mobile.setModelName("one plus 6");
		mobile.setBrand("one plus");
			
		SimCard sim = new SimCard();
		sim.setMobileNo("9999988888");
		sim.setSize("nano");
		sim.setCompany("jio");
		
		
		// java relation of has-a
		mobile.setSim(sim);
		
		// reverse 
		sim.setMobile(mobile);
		
		
		
		session.save(mobile);
		session.save(sim);
		
		transaction.commit();
		factory.close();
		session.close();
	}
}
