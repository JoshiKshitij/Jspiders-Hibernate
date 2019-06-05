package com.embedded.app;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.embedded.app.dto.Laptop;
import com.embedded.app.dto.Student;


public class Runner {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session =  factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Student ayushi = new Student();
		ayushi.setName("Ayushi");
		ayushi.setDepartment("develpment");
		ayushi.setMobileNo("9898989898");
		
		Student prabhat = new Student();
		prabhat.setName("Prabhat");
		prabhat.setDepartment("develpment");
		prabhat.setMobileNo("9876598765");
		
		Laptop asusVivoBook = new Laptop();
		asusVivoBook.setModel("vivo book s 15 pro");
		asusVivoBook.setCost(70000);
		asusVivoBook.setBrand("asus");
		// lapop belongs to prbhat
		asusVivoBook.setStudent(prabhat);
		
		
		Laptop appleMacBook = new Laptop();
		appleMacBook.setModel("Mac Book pro");
		appleMacBook.setCost(170000);
		appleMacBook.setBrand("Apple");
		// laptop belong to ayushi
		appleMacBook.setStudent(ayushi);
		
		Laptop appleMacAir = new Laptop();
		appleMacAir.setModel("Mac Book air");
		appleMacAir.setCost(100000);
		appleMacAir.setBrand("Apple");
		// laptop belong to ayushi
		appleMacAir.setStudent(ayushi);
				
		// laptops belong to prabhat
		List<Laptop> listOfPrabhatLaptops = new ArrayList<Laptop>();
		listOfPrabhatLaptops.add(asusVivoBook);
		prabhat.setLaptops(listOfPrabhatLaptops);
		
		// laptops belong to ayushi
		List<Laptop> listOfAyushiLaptops = new ArrayList<Laptop>();
		listOfAyushiLaptops.add(appleMacAir);
		listOfAyushiLaptops.add(appleMacBook);
		ayushi.setLaptops(listOfAyushiLaptops);
		
		
		
		session.save(appleMacAir);
		session.save(appleMacBook);
		session.save(asusVivoBook);
		session.save(prabhat);
		session.save(ayushi);
		
		
		transaction.commit();
		
		factory.close();
		session.close();        
		
		
		
		
		
	
	}
}
