package com.jspiders.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jspiders.dto.StudentDto;

public class StudentDao {

	public int saveStudent(StudentDto student) {
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		// save a object here
		// save method return the primary key (as a Serializable object)
		Serializable returnPK = session.save(student);
		// down cast the pk
		Integer id = (Integer)returnPK;
		
		transaction.commit();
		factory.close();
		session.close();
		return id;
	}

	public StudentDto fetchStudent(int pk) {
		
		// this will read the xml file and create the seesionfactory
		Configuration configuration = new Configuration();
		configuration.configure();
		
		// this will establish the connection to the database
		// this will do the mapping for the hibernate
		SessionFactory factory = configuration.buildSessionFactory();
		
		
		// this will perform the crud operation for the application
		Session session = factory.openSession();
		
		StudentDto studentDto = session.get(StudentDto.class, pk);
		
		return studentDto;
	}

	public void deleteStudent(int pk) {

	}

	public void updateStudent(StudentDto student) {

		Configuration configuration = new Configuration();
		configuration.configure();
		
		SessionFactory factory = configuration.buildSessionFactory();
		
		
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		StudentDto stdFromDb = session.get(StudentDto.class, student.getId());
		
		
		String email = student.getEmail();
		String name = student.getName();
		String stream = student.getStream();
		
		stdFromDb.setName(name);
		stdFromDb.setStream(stream);
		stdFromDb.setEmail(email);
		
		session.update(stdFromDb);
		transaction.commit();
		
	}

}
