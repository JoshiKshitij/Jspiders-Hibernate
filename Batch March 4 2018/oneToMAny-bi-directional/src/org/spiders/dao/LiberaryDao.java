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
		Session session2 = factory.openSession();
		LiberaryDto lib = session2.get(LiberaryDto.class, new Integer(id));
		session2.close();
		return lib;
	}

	public void updateLiberary(LiberaryDto libFromRunner) {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session2 = factory.openSession();
		session2.beginTransaction();

		// get id using dto object and use get method to get the obejct
		LiberaryDto liberaryFromDb = session2.get(LiberaryDto.class, new Integer(libFromRunner.getId()));
		liberaryFromDb.setLibNAme(libFromRunner.getLibNAme());
		liberaryFromDb.setLocation(libFromRunner.getLocation());

		// update the object
		session2.update(liberaryFromDb);
		session2.getTransaction().commit();

		session2.close();

	}

	public void deleteLiberary(LiberaryDto lib) {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session2 = factory.openSession();
		session2.delete(lib);
		session2.close();

	}

}
