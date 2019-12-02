package com.jspiders.app;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AlcoholDao  {


	public static void main(String[] args) {
		
	
		Configuration cfg = new Configuration();
		cfg.configure();
		System.out.println("configuraton done");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		
		
	}
	
}
