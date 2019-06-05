package com.embedded.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.embedded.app.dto.Mobile;
import com.embedded.app.dto.SimCard;


public class Runner2 {
	public static void main(String[] args) {
		
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session =  factory.openSession();
		
		// try commenting each fetch stateent one by one and see the output
		Mobile mobile = session.get(Mobile.class, 1);
		SimCard simCard = session.get(SimCard.class, 1);
		System.out.println(mobile +" " +mobile.getSim());;
		System.out.println(simCard +" " +  simCard.getMobile());;
	}
}
