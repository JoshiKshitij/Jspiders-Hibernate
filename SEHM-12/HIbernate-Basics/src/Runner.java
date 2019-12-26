import org.hibernate.cfg.Configuration;

public class Runner {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		
		System.out.println("Configuration done");
		
		cfg.buildSessionFactory();
		
		System.out.println("factory done");
		
	}
	

}
