package com.hql.app;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import singleton.app.HibernteUtil;

public class FetchUsingHQL {

	public static void main(String[] args) {

		SessionFactory factory = HibernteUtil.buildSessionFactory();
		Session session = factory.openSession();

	//<Student> query = 
		//session.createQuery("from Student where age > ? or stream = ?"); //
		//query.setParameter(0, 21); // query.setParameter(1, "ME");

		Query<Student> query = session.createQuery("from Student where age > :age or stream = :stream");
		query.setParameter("age", 21);
		query.setParameter("stream", "ME");

		// nameholders

		// Student student = query.uniqueResult(); // System.out.println(student);

		List<Student> list = query.list(); // list.forEach(System.out::println);

		for (Student s : list) {
			System.out.println(s);
		}

		System.out.println(Arrays.toString(returnObectArray()));

	}

	static Object[] returnObectArray() {
		return new Object[] { 1, "String ", true };
	}

}
