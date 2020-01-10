package com.hql.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import singleton.app.HibernteUtil;

// persiatnce logic has to writen in this class
public class StudentDao {

	private SessionFactory factory = HibernteUtil.buildSessionFactory();

	public StudentDto findByName(String name) {
		// you have too fill the code using hql

		Session session = factory.openSession();
		Query<StudentDto> query = session.createQuery("from StudentDto where name = :n");
		query.setParameter("n", name);
		StudentDto studentDto = query.uniqueResult();
		session.close();

		return studentDto;
	}

	Object[] findAgeAndPercenategByName(String name) {
		return null;
	}

	List<StudentDto> findAllByAgeGreaterThan(int age) {
		return null;
	}

	float findPercenategeByName(String name) {
		return -1;
	}

	List<Object[]> findStreamAndPercenategAndNameByAgeLessThan(int age) {
		return null;
	}

}
