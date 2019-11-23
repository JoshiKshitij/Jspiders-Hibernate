package com.basic.app;

import java.util.ArrayList;
import java.util.List;

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
		Transaction transaction = session.beginTransaction();
	
		FatherDto prashant = new FatherDto();
		prashant.setName("Prashant kumar");
		prashant.setMaritalStatus(true);
		prashant.setMobileNo("987654334");
		
		SonDto sagar = new SonDto();
		sagar.setName("sagar kumar");
		sagar.setMaritalStatus(false);
		sagar.setMobileNo("9988776655");
		
		
		SonDto abdul = new SonDto();
		abdul.setName("abdul");
		abdul.setMaritalStatus(true);
		abdul.setMobileNo("9988770055");
		
		
		// defining relation ship here
		List<SonDto> listOfSonsOfPrashant = new ArrayList();
		listOfSonsOfPrashant.add(abdul);
		listOfSonsOfPrashant.add(sagar);
		
		abdul.setFather(prashant);
		sagar.setFather(prashant);
		prashant.setListOfSons(listOfSonsOfPrashant);
		
		session.save(prashant);
		session.save(abdul);
		session.save(sagar);
		
		transaction.commit();
	}
	

}
