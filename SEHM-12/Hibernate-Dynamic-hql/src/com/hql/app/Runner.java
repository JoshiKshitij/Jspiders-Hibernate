package com.hql.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import singleton.app.HibernteUtil;

public class Runner {
	
	public static void main(String[] args) {
		
		SessionFactory factory = HibernteUtil.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		// 5 OBjects
		Student kj = new Student();
		kj.setName("Kshitij Joshi");
		kj.setPercentage(67.1f);
		kj.setAge(18);
		kj.setStream("ECE");
		
		Student ashok = new Student();
		ashok.setName("Ashok Shrma");
		ashok.setPercentage(87.2f);
		ashok.setAge(24);
		ashok.setStream("ECE");
		
		Student suraj = new Student();
		suraj.setName("Suraj Sham");
		suraj.setPercentage(94.8f);
		suraj.setAge(21);
		suraj.setStream("CSE");
		
		Student aarti = new Student();
		aarti.setName("Arti Shetty");
		aarti.setPercentage(95.4f);
		aarti.setAge(21);
		aarti.setStream("ME");
		
		Student salman = new Student();
		salman.setName("Salman Khan");
		salman.setPercentage(71.2f);
		salman.setAge(24);
		salman.setStream("ME");
		
		
		session.save(salman);
		session.save(kj);
		session.save(suraj);
		session.save(aarti);
		session.save(ashok);
		
		tx.commit();
		session.close();
		factory.close();
		
		
		
	}

}
