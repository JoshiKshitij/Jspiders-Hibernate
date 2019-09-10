package com.onetomany.app;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Runner {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		List<Home> listForRam = new ArrayList<Home>();
		List<Home> listForSham = new ArrayList<Home>();

		Person ram = new Person();
		ram.setName("ram");

		Person sham = new Person();
		sham.setName("sham");

		Home ramHome1 = new Home();
		ramHome1.setName("ram nivas");
		ramHome1.setType("2 bhk");

		// add home to ram list
		listForRam.add(ramHome1);

		Home ramHome2 = new Home();
		ramHome2.setName("Ram villa");
		ramHome2.setType(" 7 bhk villa");

		// add home to ram list
		listForRam.add(ramHome2);

		Home shamHome1 = new Home();
		shamHome1.setName("sham niwas");
		shamHome1.setType("3 bhk");

		// add home to sham list
		listForSham.add(shamHome1);
		
		
		// define relation here
		ram.setHomes(listForRam);
		sham.setHomes(listForSham);
		ramHome1.setPerson(ram);
		ramHome2.setPerson(ram);
		shamHome1.setPerson(sham);
		
		
		
		// save all the object 
		session.save(ram);
		session.save(sham);
		session.save(ramHome1);
		session.save(ramHome2);
		session.save(shamHome1);
		
		tx.commit();

	}

}
