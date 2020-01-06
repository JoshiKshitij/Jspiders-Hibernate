package com.oneToMany.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import singleton.app.HibernteUtil;

public class Runner {
	
	public static void main(String[] args) {
		
		// 1st one 
		SessionFactory factory = HibernteUtil.buildSessionFactory();
		
		// 2nd
	//	Configuration cfg = new Configuration();
	//	cfg.configure();
	//	SessionFactory factory2 = cfg.buildSessionFactory();
		
		Father ramPrashad = new Father();
		ramPrashad.setName("Ram prashad");
		
		Children chandni = new Children();
		chandni.setName("Chandani");
		chandni.setGender('F');
		
		Children shamBihari = new Children();
		shamBihari.setName("Sham Bihari");
		shamBihari.setGender('M');
		
		
		// father accept  list of child so ccreate list for childerns
		//List <Children> list = new ArrayList<Children>();
		//list.add(shamBihari);
		//list.add(chandni);
		
		List<Children> childList = Arrays.asList(chandni , shamBihari);
		
		// define realtionship below
		ramPrashad.setListOfChids(childList);
		chandni.setFather(ramPrashad);
		shamBihari.setFather(ramPrashad);
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(ramPrashad);
		session.save(shamBihari);
		session.save(chandni);
		
		transaction.commit();
		
		session.close();
		factory.close();
		
		
		
		
	}

}
