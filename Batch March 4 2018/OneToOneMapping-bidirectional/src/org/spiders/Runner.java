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

		session.beginTransaction();

		Laptop myLptop = new Laptop();
		myLptop.setMake("ford");
		myLptop.setModel("figo");
		myLptop.setRamSize("8 GB");

		Charger myCharger = new Charger();
		myCharger.setCordLength(2);
		myCharger.setPower("40 W");
		
		// charger belongs to a lptop
		myCharger.setLaptop(myLptop);

		//laptop has a charger
		myLptop.setCharger(myCharger);

		session.save(myLptop);
		session.save(myCharger);

		session.getTransaction().commit();

		session.close();
	}
}
