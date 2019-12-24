package com.basic.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchDao {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		// before u write further go to hibrenate.cfg.xml for mapping
		// BoyDto and GirlDto in <mapping> tag; 
		cfg.configure();
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		// we are saving Dtos so we need tansaction object
	
		BoyDto boy = session.get(BoyDto.class, new Integer(1));
		System.out.println(boy);
		
		//GirlDto girl = session.get(GirlDto.class, new Integer(1));
		//System.out.println(girl);
		
		
		
	}
	

}
