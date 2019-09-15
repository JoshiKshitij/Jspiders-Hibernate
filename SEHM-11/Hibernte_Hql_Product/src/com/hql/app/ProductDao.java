package com.hql.app;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class ProductDao {

	SessionFactory sf = HibernateUtil.getSessionFactory();

	ProductDto findByName(String name) {

		ProductDto dto = null;
		try (Session session = sf.openSession()) {

			Query<ProductDto> query = session.createQuery("from ProductDto where name = :name");
			query.setParameter("name", name);
			dto = query.uniqueResult();

		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dto;
	}

	List<ProductDto> findByPriceLessThan(int price) {
		List<ProductDto> list = null;
		
		try (Session session = sf.openSession()) {

			Query<ProductDto> query = session.createQuery("From ProductDto where price <=:price");
			query.setParameter("price", price);
			list =  query.list();

		} catch (HibernateException e) {
			e.printStackTrace();
		}
	
		return list;
	}

	List<ProductDto> findByCategory(String category) {
		Query<ProductDto> query= null;
		try (Session session = sf.openSession()) {

			query = session.createQuery("from Product where category =:category");
			query.setParameter("category", category);
			 query.list();

		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return query.list();
	}

	List<?> findNameAndPriceByCategory(String category) {
		
		List<?> list = null;
		
		try (Session session = sf.openSession()) {

			Query<List<Object[]>> query = session.createQuery("select name , price from ProductDto where category =:cat");
			query.setParameter("cat", category);
			list =  query.list();

		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	String FindNameById(int id) {
		String name = null;
		
		try (Session session = sf.openSession()) {

			Query<String> query = session.createQuery("select name from ProductDto where id = :id");
			query.setParameter("id", id);
			name =  query.uniqueResult();

		} catch (HibernateException e) {
			e.printStackTrace();
		}

		return name;
	}

}
