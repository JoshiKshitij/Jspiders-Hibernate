package com.jspiders.app;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class AlcoholFetchDaoHql {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		System.out.println("configuraton done");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Query<AlcoholDto> query = session.createQuery(" from AlcoholDto ac where id = ?");
		query.setParameter(1, 2);
		AlcoholDto result = query.uniqueResult();
		System.out.println(result);
		
		Query<AlcoholDto> query1 = session.createQuery(" from AlcoholDto ac where brand =:brand");
		query.setParameter("brand", "JD");
		List<AlcoholDto> result1 = query1.list();
		System.out.println(result1);

		// System.out.println(al);
	}

}
