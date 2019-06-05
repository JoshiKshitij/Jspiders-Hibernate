import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HIbernateDemo {
	public static void main(String[] args) {
		System.out.println("app started");
		Configuration configuration = new Configuration();
		configuration.configure();
		
		SessionFactory factory = configuration.buildSessionFactory();
		/*
		 * Session session = factory.openSession();
		 * 
		 * Transaction transaction = session.beginTransaction();
		 * 
		 * Student s1 = new Student(); s1.setRollNo(101); s1.setName("robot");
		 * s1.setEmail("rgb@gmail.com");
		 * 
		 * session.save(s1); transaction.commit();
		 */	
	}

}
