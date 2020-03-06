package com.crud.test;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Runner {

	public static void main(String[] args) {
		/*
		 * SessionFactory factory1 = HibernateUtil.buildSessionFactory();
		 * System.out.println("-----factory 1 created-----");
		 * 
		 * SessionFactory factory2 = HibernateUtil.buildSessionFactory();
		 * System.out.println("-----factory 2 created------");
		 * System.out.println(factory1==factory2);
		 */

		SessionFactory factory1 = new Configuration().configure().buildSessionFactory();
		System.out.println("-----factory 1 created-----");

		SessionFactory factory2 = new Configuration().configure().buildSessionFactory();
		System.out.println("-----factory 2 created------");
		System.out.println(factory1 == factory2);
	}
}
