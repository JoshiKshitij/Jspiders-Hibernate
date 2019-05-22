package org.spiders;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.spiders.HibernateUtil;

public class Runner {

	public static void main(String[] args) {
		
		// make connection
		// built session
		// mapping classes to table
		// 2nd level cache maintainer
		SessionFactory factory = HibernateUtil.getFactory();
		
		// crud operation
		// 1st level cache maintainer
		Session session = factory.openSession();
			
		session.beginTransaction();
		
		Human kshitij = new Human();
		kshitij.setFirstName("Kshitij");
		kshitij.setLastName("Joshi");
		kshitij.setAge(18);
		
		
		Heart kjHeart = new Heart();
		kjHeart.setBeatsPerMin(72);
		kjHeart.setHasDisease(false);
		
		kshitij.setHeart(kjHeart);
		
		session.save(kshitij);
		session.save(kjHeart);
		
		session.getTransaction().commit();
		session.close();
	}
}
