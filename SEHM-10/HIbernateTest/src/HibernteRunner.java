import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernteRunner {
	
	public static void main(String[] args) {
		
		
		// will read the db information and mapping class information
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		/*
		 * Transaction transaction = session.beginTransaction();
		 * 
		 * OnlineSeries got = new OnlineSeries(); got.setId(1);
		 * got.setMainChar("araya stark"); got.setNoOfSeasons(8);
		 * got.setVillan("night king");
		 * 
		 * session.save(got); transaction.commit();
		 */
		
		
		OnlineSeries got = session.get(OnlineSeries.class, 1);
		System.out.println(got);
		System.out.println("-----------------");
		OnlineSeries ser = session.get(OnlineSeries.class, 2);
		System.out.println(ser);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
