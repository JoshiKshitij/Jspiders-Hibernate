package org.spiders;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Runner {
	
	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure();
		
		SessionFactory factory = configuration.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Student student = new Student();
		student.setStdName("vinay goyal");
		student.setStdStream("cse");
		
		Laptop laptop = new Laptop();
		laptop.setHardDriverSpace("1tb");
		laptop.setRam("16 gb");
		
		student.setLaptop(laptop);
		
		session.save(student);
		transaction.commit();
		
	}
}
