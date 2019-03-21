package org.spiders;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.spiders.dao.LiberaryDao;
import org.spiders.dto.BooksDto;
import org.spiders.dto.LiberaryDto;

import com.spiders.HibernateUtil;

public class Runner {

	public static void main(String[] args) {

		/*
		 * LiberaryDto marvat = new LiberaryDto(); marvat.setLibNAme("marvat");
		 * marvat.setLocation("delhi");
		 * 
		 * List<BooksDto> listOfBooks = new ArrayList<BooksDto>();
		 * 
		 * BooksDto halfGf = new BooksDto(); halfGf.setAuthor("chetan bhagat");
		 * halfGf.setName("half girlFriend"); halfGf.setLiberary(marvat);
		 * 
		 * BooksDto theAlchamist = new BooksDto();
		 * theAlchamist.setAuthor("paulo cohelo");
		 * theAlchamist.setName("The Alchamist"); theAlchamist.setLiberary(marvat);
		 * 
		 * BooksDto rdpd = new BooksDto(); rdpd.setAuthor("roberts");
		 * rdpd.setName("Rich dad poor dad"); rdpd.setLiberary(marvat);
		 * 
		 * listOfBooks.add(halfGf); listOfBooks.add(theAlchamist);
		 * listOfBooks.add(rdpd);
		 * 
		 * marvat.setListOfBooks(listOfBooks); LiberaryDao liberaryDao = new
		 * LiberaryDao();
		 * 
		 * liberaryDao.saveLibraryAndBooks(marvat, listOfBooks);
		 */
		
		LiberaryDao liberaryDao = new LiberaryDao();
		LiberaryDto liberaryDto = liberaryDao.getLiberaryById(1);
		System.out.println(liberaryDto.getLibNAme());
		//System.out.println(liberaryDto.getListOfBooks());

	}
}
