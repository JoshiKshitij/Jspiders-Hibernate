package com.crud.test;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory factory;

	static {
		factory = new Configuration()
				.configure()
					.buildSessionFactory();
	}

	private HibernateUtil() {
		// private Constructor
	}

	static SessionFactory buildSessionFactory() {
		return factory;
	}

}
