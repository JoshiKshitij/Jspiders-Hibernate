package app.demo.test;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Runner {
	
	public static void main(String[] args) {
		
		// will read hibernate.cfg.xml file from src folder directly
		Configuration cfg = new Configuration();
		cfg.configure();
		
		System.out.println("configuraton done");
		
		// 20 database connection will create u SessionFactory
		// will perfrom DDL queries 
		SessionFactory sf = cfg.buildSessionFactory();
		System.out.println("connection established with DB");
		
		
		// use 1 connection and JDBC statements to perform CRUD
		Session session = sf.openSession();
		
		// transaction is set to autoCommit= false in hibernate 
		// so to manupulate DATA in DB we will Create a tractions
		// only for DML queries
		Transaction tx = session.beginTransaction();
		
		Food food = new Food();
		food.setFoodId(2);
		food.setFoodFrom("Punjab");
		food.setName("Butter chicken");;
		food.setFamousFor("Masala");
		
		
		session.save(food);
		
		tx.commit();
		
		
		// close resources
		session.close();
		sf.close();
		
		
	}

}
