package com.jspiders.app;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class AlcoholFetchDaoHql {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		System.out.println("configuraton done");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
	//	Query query = session.createQuery("From AlcoholDto where id = 2");
		Query query = session.createQuery("select ac.id , ac.brand from AlcoholDto ac where id = 2");
		Object object = query.uniqueResult();	
		
		//		AlcoholDto al = (AlcoholDto)object;
		//		System.out.println(al);
		
		Object[] objectArray = (Object[]) object;

		for (Object o : objectArray) {
			System.out.println(o);
		}
		
		
		//System.out.println(al);
	}

}
