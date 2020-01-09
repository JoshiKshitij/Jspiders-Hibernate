package singleton.app;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernteUtil {
	
	private final static SessionFactory factory;

	static {
		Configuration cfg = new Configuration();
		cfg.configure();
		
		factory = cfg.buildSessionFactory();
	}
	public static final synchronized SessionFactory buildSessionFactory() {
		return factory;
	}
	
	private HibernteUtil() {}
	
	
}
