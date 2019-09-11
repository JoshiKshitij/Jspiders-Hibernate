package com.many_to_many.app;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Runner {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		Teacher shishiraSir = new Teacher();
		shishiraSir.setName("Shishira Sir Ji");
		
		Teacher vivekSir = new Teacher();
		vivekSir.setName("Vivek Sir Ji");
		
		Teacher kshitij = new Teacher();
		kshitij.setName("Kshitij");
		
		
		Student paritosh = new Student();
		paritosh.setName("paritosh");
		
		Student navdeep = new Student();
		navdeep.setName("navdeep");
		
		Student rashmita = new Student();
		rashmita.setName("rashmita");
		
		Student pawan = new Student();
		pawan.setName("pawan");
		
		
		// realtionship
		shishiraSir.getStudents().add(navdeep);
		shishiraSir.getStudents().add(paritosh);
		
		vivekSir.getStudents().add(rashmita);
		
		kshitij.getStudents().add(rashmita);
		kshitij.getStudents().add(navdeep);
		kshitij.getStudents().add(paritosh);
		kshitij.getStudents().add(pawan);
		
		navdeep.getTeachers().add(shishiraSir);
		navdeep.getTeachers().add(kshitij);
		
		paritosh.getTeachers().add(shishiraSir);
		paritosh.getTeachers().add(kshitij);
		
		rashmita.getTeachers().add(vivekSir);
		rashmita.getTeachers().add(kshitij);
		
		pawan.getTeachers().add(kshitij);
		
		
		session.save(shishiraSir);
		session.save(vivekSir);
		session.save(kshitij);
		session.save(navdeep);
		session.save(paritosh);
		session.save(rashmita);
		session.save(pawan);
		
		
		tx.commit();

	}

}
