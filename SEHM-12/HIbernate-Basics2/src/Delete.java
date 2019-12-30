import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Delete {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();

		System.out.println("configuraton done");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		System.out.println("factory done");

		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();
		Human h1 = session.get(Human.class, new Integer(5));
		session.delete(h1);

		transaction.commit();
		session.close();
		sessionFactory.close();

	}

}
