package org.spiders.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.spiders.dto.BooksDto;
import org.spiders.dto.LiberaryDto;

import com.spiders.HibernateUtil;

public class LiberaryDao {

	public int saveLibrary(LiberaryDto liberaryDto) {

		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.openSession();

		session.beginTransaction();

		// return the primary key
		Serializable save = session.save(liberaryDto);
		Integer id = (Integer) save;

		session.getTransaction().commit();
		return id;
	}

	public int saveLibraryAndBooks(LiberaryDto liberaryDto, List<BooksDto> listOfBooks) {

		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.openSession();

		session.beginTransaction();

		// return the primary key
		Serializable save = session.save(liberaryDto);
		Integer id = (Integer) save;

		for (BooksDto book : listOfBooks) {
			session.save(book);
		}

		session.getTransaction().commit();
		return id;
	}

	public LiberaryDto getLiberaryById(int id) {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.openSession();
		session.get(LiberaryDto.class, new Integer(id));
		session.close();
		
		Session session2 = factory.openSession();
		LiberaryDto lib = session2.get(LiberaryDto.class, new Integer(id));
		session2.close();
		return lib;
	}

}
