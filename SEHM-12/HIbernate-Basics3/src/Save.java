import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Save {

	public static void main(String[] args) {
		// it will read hibernate.cfg.xml file
		Configuration cfg = new Configuration();
		cfg.configure();
		System.out.println("configuraton done");
		
		// it will create connections
		// will do ORM
		// will Execute DDL
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		System.out.println("factory done");

		// use connection to perform CRUD
		// execute DML/DQL
		Session session = sessionFactory.openSession();
		
		// to make changes in DB
		Transaction transaction = session.beginTransaction();

		Alcohol oldMonk = new Alcohol();
		oldMonk.setName("old monk");
		oldMonk.setPrice(480);
		oldMonk.setBrand("old monk");
		oldMonk.setQuantity("750");
		
		Alcohol black = new Alcohol();
		black.setName("black dog");
		black.setPrice(2080);
		black.setBrand("Jonny walker");
		black.setQuantity("750");
		
		Alcohol jd = new Alcohol();
		jd.setName("jd");
		jd.setPrice(480);
		jd.setBrand("Jack denails");
		jd.setQuantity("750");
		
		
		session.save(jd);
		session.save(black);
		session.save(oldMonk);
		
		transaction.commit();
		session.close();
		sessionFactory.close();
		
	}
	
}