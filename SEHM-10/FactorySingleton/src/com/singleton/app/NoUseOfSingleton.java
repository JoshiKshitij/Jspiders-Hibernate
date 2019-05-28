package com.singleton.app;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class NoUseOfSingleton {
	
	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure();
		
		
		SessionFactory factory1 = configuration.buildSessionFactory();
		System.out.println("--------------------------");
		SessionFactory factory2 = configuration.buildSessionFactory();
		
		
		System.out.println(factory1 == factory2);
	}

}
