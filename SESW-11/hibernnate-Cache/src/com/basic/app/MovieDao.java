package com.basic.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MovieDao {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		MovieDto kgf = new MovieDto();
	//	kgf.setId(1);
		kgf.setName("KGF");
		kgf.setStars("****");
		
		MovieDto kabirSingh = new MovieDto();
	//	kabirSingh.setId(2);
		kabirSingh.setName("Kabir Singh");
		kabirSingh.setStars("***");
		
		MovieDto heraFeri = new MovieDto();
	//	heraFeri.setId(3);
		heraFeri.setName("Hera Feri");
		heraFeri.setStars("*****");
		
		session.save(kgf);
		session.save(kabirSingh);
		session.save(heraFeri);
		
		transaction.commit();
		
		
	}

}
