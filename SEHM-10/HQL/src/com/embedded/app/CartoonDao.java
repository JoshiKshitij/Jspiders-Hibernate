package com.embedded.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class CartoonDao {

	SessionFactory factory = HibernateUtils.getSessionFactory();

	public CartoonDto getCartoonByName(String name) {
		Session session = factory.openSession();

		Query query = session.createQuery("select c from CartoonDto c where name= :name");
		query.setParameter("name", name);

		return (CartoonDto) query.uniqueResult();
	}

	public List<CartoonDto> getCartoonsByNameOrRating(String name, String rating) {

		Session session = factory.openSession();

		Query<CartoonDto> query = session
				.createQuery("select c from CartoonDto c where name= :name or rating = :rating");
		query.setParameter("name", name);
		query.setParameter("rating", rating);

		return query.list();
	}

	public CartoonDto getCartoonByNameAndRating(String name, String rating) {

		Session session = factory.openSession();

		Query<CartoonDto> query = session
				.createQuery("select c from CartoonDto c where name= :name and rating = :rating");
		query.setParameter("name", name);
		query.setParameter("rating", rating);

		return query.uniqueResult();

	}

	public String getCartoonNamebyId(long id) {

		Session session = factory.openSession();

		Query<String> query = session.createQuery("select name from CartoonDto where id = ?");
		query.setParameter(0, id);
		return query.uniqueResult();

	}

	public List<Object[]> getCartoonNameAndIdbyRating(String rating) {

		Session session = factory.openSession();
		Query<Object[]> query = session.createQuery("select name , id from CartoonDto where rating = ?");
		query.setParameter(0, rating);
		
		return query.list();

	}
	
	public Object[] getCartoonNameAndRankbyid(long id) {

		Session session = factory.openSession();
		Query<Object[]> query = session.createQuery("select name , rating from CartoonDto where id = ?");
		query.setParameter(0,id);
		
		return query.uniqueResult();

	}

}
