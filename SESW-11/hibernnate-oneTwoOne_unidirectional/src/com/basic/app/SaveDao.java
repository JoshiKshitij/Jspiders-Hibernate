package com.basic.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveDao {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		// before u write further go to hibrenate.cfg.xml for mapping
		// BoyDto and GirlDto in <mapping> tag; 
		cfg.configure();
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		// we are saving Dtos so we need tansaction object
		
		Transaction transaction = session.beginTransaction();
		
		BoyDto abdul = new BoyDto();
		abdul.setName("rakesh");
		abdul.setBranch("Cse");
		
		GirlDto xyz = new GirlDto();
		xyz.setName("dreamGirl");
		xyz.setBranch("ece");
		
		// relationsShip
		abdul.setGirl(xyz);
		xyz.setBoy(abdul);
		
		session.save(abdul);
		session.save(xyz);
		transaction.commit();
	}
	

}
