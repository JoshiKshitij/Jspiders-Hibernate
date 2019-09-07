package com.singleton.factory;

import org.hibernate.SessionFactory;

public class Runner {
	
	public static void main(String[] args) {
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		System.out.println("--------");
		SessionFactory sf1 = HibernateUtil.getSessionFactory();
		
		System.out.println(sf1 == sf);
	}

}
