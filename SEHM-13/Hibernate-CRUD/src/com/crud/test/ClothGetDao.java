package com.crud.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClothGetDao {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		
		ClothDto cl = session.get( ClothDto.class , 13);
		System.out.println(cl);
	
		session.close();
		sf.close();
	
		System.out.println("App end");
		
		
	}
	
	
}
