package com.spiders;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory factory = null;
	static {
		Configuration cfg = new Configuration();
		cfg.configure();
		factory = cfg.buildSessionFactory();
	}

	private HibernateUtil() {
		System.out.println("SessionFactory Created");
	}

	static public SessionFactory getFactory() {
		System.out.println(factory);
		return factory;
	}


}
