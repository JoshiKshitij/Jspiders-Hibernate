package com.singleton.app;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

// singleton class
public class HibernateUtils {

	// 1. step to create a ststic varriable
	private static SessionFactory factory = null;
	static {
		Configuration configuration = new Configuration();
		configuration.configure();
		factory =configuration.buildSessionFactory();
		
	}
	public static  SessionFactory getSessionFactory() {
	
		return factory;
	}
	private  HibernateUtils() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
