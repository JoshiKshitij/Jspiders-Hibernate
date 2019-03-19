package org.spiders;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.spiders.HibernateUtil;

public class Runner {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.openSession();

		session.beginTransaction();
		
		Liberary marvat = new Liberary();
		marvat.setLibNAme("marvat");
		marvat.setLocation("delhi");;
		
		// create a list of books
		List<Books> listOfBooks = new ArrayList<Books>();
		
		Books halfGf = new Books();
		halfGf.setAuthor("chetan bhagat");
		halfGf.setName("half girlFriend");
		halfGf.setLiberary(marvat);
		
		Books theAlchamist = new Books();
		theAlchamist.setAuthor("paulo cohelo");
		theAlchamist.setName("The Alchamist");
		theAlchamist.setLiberary(marvat);
		
		Books rdpd = new Books();
		rdpd.setAuthor("roberts");
		rdpd.setName("Rich dad poor dad");
		rdpd.setLiberary(marvat);
		
		listOfBooks.add(halfGf);
		listOfBooks.add(theAlchamist);
		listOfBooks.add(rdpd);
		
		marvat.setListOfBooks(listOfBooks);
		
		session.save(theAlchamist);
		session.save(rdpd);
		session.save(halfGf);
		session.save(marvat);
		
		session.getTransaction().commit();
		
		session.close();
	}
}
