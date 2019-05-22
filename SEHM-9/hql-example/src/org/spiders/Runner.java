package org.spiders;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.spiders.HibernateUtil;

public class Runner {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Session session = HibernateUtil.getFactory().openSession();

		
		SchoolDto school = new SchoolDto("dummy", "1231231", "myboard");
		
		session.persist(school);
		
		
		
	}
}
