package org.spiders;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.spiders.HibernateUtil;

public class Runner {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Session session = HibernateUtil.getFactory().openSession();

		/*
		 * SchoolDto dto = new SchoolDto("sgrr" , "8000 sqft" ,"cbse"); SchoolDto dto1 =
		 * new SchoolDto("skss" , "17000 sqft" ,"icsc"); SchoolDto dto2 = new
		 * SchoolDto("dps" , "15000 sqft" ,"csbe"); SchoolDto dto3 = new SchoolDto("dav"
		 * , "12000 sqft" ,"cbse");
		 * 
		 * session.save(dto); session.save(dto1); session.save(dto2);
		 * session.save(dto3);
		 */

		// session.beginTransaction();
		// session.getTransaction().commit();

		// select * from table_school;
		// hql - >>> from SchoolDto(class name)

		// sql -- >> select school.* from table_school school;
		// hql-->> select school from SchoolDto school;

		@SuppressWarnings("unchecked")
		Query<SchoolDto> query = session.createQuery("select school from SchoolDto school" 
		+ " where board = :board ");
		query.setString("board", "cbse");
		
		List<SchoolDto> list = query.list();
		// SchoolDto schoolDto = (SchoolDto)query.uniqueResult();
		// System.out.println(schoolDto);

		for (SchoolDto school : list) {
			System.out.println(school);
		}

	}
}
