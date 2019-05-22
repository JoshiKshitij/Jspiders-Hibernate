package org.spiders;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.spiders.HibernateUtil;

public class Runner {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getFactory(); // hibrnate.cfg.xml
		
		// to perform CRUD opertaions
		Session session = factory.openSession();
		
		
		Library marvat = new Library();
		marvat.setName("marvat");
		marvat.setLibrarianName("Mr Taneja");
		
		// create a list of books
		List<Books> listOfBooks = new ArrayList<Books>();
		Books halfGf = new Books();
		halfGf.setAuthor("chetan bhagat");
		halfGf.setName("half girlFriend");
		Books theAlchamist = new Books();
		theAlchamist.setAuthor("paulo cohelo");
		theAlchamist.setName("The Alchamist");
		Books rdpd = new Books();
		rdpd.setAuthor("roberts");
		rdpd.setName("Rich dad poor dad");
		listOfBooks.add(halfGf);
		listOfBooks.add(theAlchamist);
		listOfBooks.add(rdpd);
		marvat.setListOfBooks(listOfBooks);
		
		
		Library hinduja = new Library();
		hinduja.setName("hinduja");
		hinduja.setLibrarianName("Mr Singh");
		
        List<Books> listOfBooksForHinduaj = new ArrayList<Books>();
		Books wwcwud = new Books();
		wwcwud.setAuthor("orbin sharna");
		wwcwud.setName("Who will cry when u die");
		Books theKiteRunner = new Books();
		theKiteRunner.setAuthor("ahemd");
		theKiteRunner.setName("the kite runner");
		Books mwshf = new Books();
		mwshf.setAuthor("div methew");
		mwshf.setName("monk who sold his ferrari");
		listOfBooksForHinduaj.add(mwshf);
		listOfBooksForHinduaj.add(wwcwud);
		listOfBooksForHinduaj.add(theKiteRunner);
		hinduja.setListOfBooks(listOfBooksForHinduaj);
		
		
		
		
		session.beginTransaction();
		
		session.save(marvat);
		
		session.save(hinduja);
		session.getTransaction().commit();
		
		session.close();
	}
}
