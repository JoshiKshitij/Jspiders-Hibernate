package com.crud.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Fetch {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();

		Session session = sessionFactory.openSession();
		
		//SonDto son = session.get(SonDto.class , 1);
		FatherDto father = session.get(FatherDto.class , 1);
		
		System.out.println("--------");	
		List<SonDto> sons = father.getSons();
		System.out.println(sons);
		
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
