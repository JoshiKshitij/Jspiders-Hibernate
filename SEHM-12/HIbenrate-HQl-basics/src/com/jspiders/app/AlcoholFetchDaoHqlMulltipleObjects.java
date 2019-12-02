package com.jspiders.app;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class AlcoholFetchDaoHqlMulltipleObjects {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		System.out.println("configuraton done");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Query<AlcoholDto> query = session.createQuery("From AlcoholDto ");
		List<AlcoholDto> allAlchohols = query.list();
		for (AlcoholDto alcoholDto : allAlchohols) {
			System.out.println(alcoholDto);
		}

		 Query<Object[]> query1 = session.createQuery("select ac.id , ac.brand from AlcoholDto ac ");
		 List<Object[]> list = query1.list();
		 for (Object[] ob : list) {
			System.out.println(Arrays.toString(ob));
		}
	}

}
