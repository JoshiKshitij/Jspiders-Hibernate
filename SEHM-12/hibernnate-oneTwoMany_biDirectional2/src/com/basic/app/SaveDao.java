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
	
		StudentDto prashant = new StudentDto();
		prashant.setName("Prashant kumar");
		prashant.setMobileNo("987654334");
		prashant.setStream("Mechanical");
		
		LaptopDto apple = new LaptopDto();
		apple.setBrand("Apple");
		apple.setModel("MackBook pro 16");
		apple.setPrice(235000.00);
		
		LaptopDto lenovo = new LaptopDto();
		lenovo.setBrand("Lenovo");
		lenovo.setModel("think pad carbon X");
		lenovo.setPrice(175000.00);
		
		
		// defining relation ship here
		
		prashant.getLaptops().add(apple);
		prashant.getLaptops().add(lenovo);
		lenovo.setStudent(prashant);
		apple.setStudent(prashant);
		
		session.save(prashant);
		session.save(apple);
		session.save(lenovo);
		
		transaction.commit();
	}
	

}
