package com.singleton.app;

import org.hibernate.SessionFactory;

public class UseOfSingelton {

	
	public static void main(String[] args) {
		
		SessionFactory factory1 = HibernateUtils.getSessionFactory();
		System.out.println("------------------");
		SessionFactory factory2 = HibernateUtils.getSessionFactory();
		System.out.println(factory1 == factory2);
		
		SessionFactory factory3 = HibernateUtils.getSessionFactory();
		System.out.println("------------------");
		SessionFactory factory4 = HibernateUtils.getSessionFactory();
	}
}
