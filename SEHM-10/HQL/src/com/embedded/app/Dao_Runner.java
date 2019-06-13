package com.embedded.app;

import java.util.List;

import org.hibernate.Session;

public class Dao_Runner {
	
	public static void main(String[] args) {
		
		CartoonDto cartoonDto = new CartoonDto();
		
		Session session = HibernateUtils.getSessionFactory().openSession();
		
		
		
		session.save(cartoonDto);
		
		session.persist(cartoonDto);
		
		
		
	}
}

