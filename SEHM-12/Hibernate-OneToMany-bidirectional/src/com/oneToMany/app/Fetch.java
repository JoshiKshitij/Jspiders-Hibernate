package com.oneToMany.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import singleton.app.HibernteUtil;

public class Fetch {

	public static void main(String[] args) {

		SessionFactory factory = HibernteUtil.buildSessionFactory();
		Session session = factory.openSession();

		 Father father = session.get(Father.class, new Long(1));
		 System.out.println(father);
		// System.out.println(father.getListOfChids());

	//	Children child = session.get(Children.class, new Long(1));
	//	System.out.println(child);
		session.close();
		factory.close();

	}

}
