package com.basic.app;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

class HibernateUtil {

	private final static SessionFactory factory;

	static {
		Configuration cfg = new Configuration();
		cfg.configure();
		factory = cfg.buildSessionFactory();
	}

	public static synchronized SessionFactory getSessionFactory() {
		return factory;
	}

	private HibernateUtil() {
		super();
	}

}
