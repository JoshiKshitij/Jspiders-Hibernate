package com.crud.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Runner {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();

		FatherDto ramdayal = new FatherDto();
		ramdayal.setName("RAM DAYAL");
		ramdayal.setSalary(80000);

		SonDto karan = new SonDto();
		karan.setName("KARAN");
		karan.setStream("ece");

		SonDto charan = new SonDto();
		charan.setName("CHARAN");
		charan.setStream("me");

		// relations ship
		karan.setFather(ramdayal);
		charan.setFather(ramdayal);
		List<SonDto> listOfSonsForRamdayal = Arrays.asList(karan, charan);
		ramdayal.setSons(listOfSonsForRamdayal);

		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(ramdayal);
		session.save(charan);
		session.save(karan);
		
		
		tx.commit();
		session.close();
		sessionFactory.close();
		
		
		
		
		
		
		
		
		
//		List<SonDto> example1 = new ArrayList<SonDto>();
//		example1.add(charan);
//		example1.add(karan);
//		ramdayal.setSons(example1);
//		
//		ramdayal.setSons(new ArrayList<SonDto>() {{
//			add(karan);
//			add(charan);
//		}});
		
		
		
		
		

	}
}
