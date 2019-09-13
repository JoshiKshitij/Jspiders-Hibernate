package com.hql.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class StudentDao {

	SessionFactory sf = HibernateUtil.getSessionFactory();

	Student findStudentByRollNo(int rollNo) {
		Student student = null;

		Session session = sf.openSession();
		Query<?> query = session.createQuery("from Student where rollNo =:roll");
		query.setParameter("roll", rollNo);

		student = (Student) query.uniqueResult();
		session.close();
		return student;
	}

}
