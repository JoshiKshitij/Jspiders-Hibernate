package com.hql.app;

import java.util.List;

import org.hibernate.SessionFactory;

public class FetchRunner {

	public static void main(String[] args) {

		ProductDao dao = new ProductDao();
		// System.out.println(dao.findByName("one plus 6"));
		// dao.findByPriceLessThan(60000).forEach(pro -> System.out.println(pro));

		List<Object[]> list  = (List<Object[]>)dao.findNameAndPriceByCategory("cloths");
		
		for (Object[] objects : list) {
			System.out.print((String)objects[0] + "  ");
			System.out.println((int)objects[1]);
		}
		
		
		
		
		

	}

}
