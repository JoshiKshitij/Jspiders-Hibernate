package com.embedded.app;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.embedded.app.dto.PassangerDto;
import com.embedded.app.dto.TrainDto;


public class Runner {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session =  factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		TrainDto humsafar = new TrainDto();
		humsafar.setName("humsafar");
		humsafar.setNoOfcoaches("10");
		humsafar.setTrainNO("2342341");
		
		PassangerDto soniaGandhi = new PassangerDto();
		soniaGandhi.setEmail("sonia@gmailc.com");
		soniaGandhi.setName("sonia");
		soniaGandhi.setMobileNo("987898789");
		soniaGandhi.setTrainDto(humsafar);
		
		PassangerDto krishna = new PassangerDto();
		krishna.setEmail("krishna@gmailc.com");
		krishna.setName("krishna");
		krishna.setMobileNo("123435356");
		krishna.setTrainDto(humsafar);
		
		PassangerDto ajay = new PassangerDto();
		ajay.setEmail("ajay@gmailc.com");
		ajay.setName("ajay");
		ajay.setMobileNo("0986543212");
		ajay.setTrainDto(humsafar);
		
		List<PassangerDto> listOfPass = new ArrayList<PassangerDto>();
		listOfPass.add(ajay);
		listOfPass.add(krishna);
		listOfPass.add(soniaGandhi);
		
		humsafar.setListOfPassangers(listOfPass);
		
		
		
		session.save(ajay);
		session.save(soniaGandhi);
		session.save(krishna);
		session.save(humsafar);
		
		
		transaction.commit();
		
		factory.close();
		session.close();
		
		
		
		
		
	
	}
}
