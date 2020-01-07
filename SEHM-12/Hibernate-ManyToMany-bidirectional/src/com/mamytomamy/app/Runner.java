package com.mamytomamy.app;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import singleton.app.HibernteUtil;

public class Runner {

	public static void main(String[] args) {
		
		// build factory
		SessionFactory factory = HibernteUtil.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		//create objects
		Teacher shishiraSir = new Teacher();
		shishiraSir.setName("Shishira Sir");
		shishiraSir.setTeachesSubject("JAVA");
		
		Teacher vivekSir = new Teacher();
		vivekSir.setName("Vivek Sir");
		vivekSir.setTeachesSubject("JAVA");
		
		Teacher nageshSir = new Teacher();
		nageshSir.setName("Nagesh Sir");
		nageshSir.setTeachesSubject("SQL");
		
		Teacher nikhilaMam = new Teacher();
		nikhilaMam.setName("Nikhila MAM");
		nikhilaMam.setTeachesSubject("SQL");
		
	
		Student ashok = new Student();
		ashok.setGender('M');
		ashok.setName("Ashok");
		
		Student gopi = new Student();
		gopi.setGender('M');
		gopi.setName("Gopi");
		
		Student kishan = new Student();
		kishan.setGender('M');
		kishan.setName("kishan");
		
		Student sathya = new Student();
		sathya.setGender('M');
		sathya.setName("Sathya");
		
		Student suraj = new Student();
		suraj.setGender('M');
		suraj.setName("Suraj");
		
		
		// list for teacher
		List<Student> studentListForShishirSir = Arrays.asList(ashok , gopi , sathya);
		List<Student> studentListForVivekSir = Arrays.asList(kishan);
		List<Student> studentListForNageshSir = Arrays.asList(ashok , gopi , kishan);
		List<Student> studentListForNikhilaMam = Arrays.asList(sathya , suraj);
		
		// list for studens
		List<Teacher> teachersListForAshok = Arrays.asList(shishiraSir , nageshSir);
		List<Teacher> teachersListForGopi = Arrays.asList(shishiraSir , nageshSir);
		List<Teacher> teachersListForkishan = Arrays.asList(vivekSir , nageshSir);
		List<Teacher> teachersListForSatya = Arrays.asList(shishiraSir , nikhilaMam);
		List<Teacher> teachersListForSuraj = Arrays.asList(nikhilaMam);
		
		// relationship to defined below
		shishiraSir.setStudents(studentListForShishirSir);
		vivekSir.setStudents(studentListForVivekSir);
		nageshSir.setStudents(studentListForNageshSir);
		nikhilaMam.setStudents(studentListForNikhilaMam);
		
		ashok.setTeachers(teachersListForAshok);
		gopi.setTeachers(teachersListForGopi);
		kishan.setTeachers(teachersListForkishan);
		sathya.setTeachers(teachersListForSatya);
		suraj.setTeachers(teachersListForSuraj);
		
		session.save(shishiraSir);
		session.save(nageshSir);
		session.save(vivekSir);
		session.save(nikhilaMam);
		
		session.save(ashok);
		session.save(gopi);
		session.save(suraj);
		session.save(sathya);
		session.save(kishan);
		
		tx.commit();
		
		session.close();
		factory.close();
		
				
	}
	
}
