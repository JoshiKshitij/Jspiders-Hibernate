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

		return null;
	}

	public void deleteStudent(int pk) {

	}

	public StudentDto updateStudent(StudentDto student) {

		return null;
	}

}
