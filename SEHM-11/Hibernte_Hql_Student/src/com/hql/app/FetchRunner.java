package com.hql.app;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class FetchRunner {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session session = sf.openSession();
		/*
		 * Query<Student> query = session. createQuery("from Student where age = ?" );
		 * query.setParameter(0, 20); List<Student> list = query.list();
		 * System.out.println(list);
		 */
		
		/*
		 * Query<Student> newQuery = session.createQuery("from Student where age =:a" );
		 * newQuery.setParameter("a", 20);
		 * 
		 * List<Student> list2 = newQuery.list(); System.out.println(list2);
		 */
		
		
		
		StudentDao studentDao= new StudentDao();
		Student student = studentDao.findStudentByRollNo(4);
		System.out.println(student);
		
	}

}
