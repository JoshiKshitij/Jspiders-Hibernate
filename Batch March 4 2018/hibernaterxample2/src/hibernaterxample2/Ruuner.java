package hibernaterxample2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Ruuner {
	
	// saving logic 
	public static void main(String[] args) {
			
		Configuration configuration = new Configuration();
		configuration.configure();
		
		SessionFactory factory = configuration.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		ClassRoom classRoom = session.get(ClassRoom.class, new Integer(2));
		System.out.println(classRoom);
		
		classRoom.setFloorNo(3);
		classRoom.setNoOfStudent(100);
		classRoom.setRoomName("210");
		
		session.update(classRoom);
		transaction.commit();
		session.close(); 
		
	}
}
