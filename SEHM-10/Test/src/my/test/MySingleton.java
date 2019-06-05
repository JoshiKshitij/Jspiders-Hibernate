package my.test;

public class MySingleton {

	// static varrible to store the object
	private static MySingleton singleton = null;
	
	static {
		System.out.println("static block executed");
			singleton = new MySingleton();
	}
	
	public static MySingleton getObject(){
		return singleton;
	}
	
	private MySingleton() {
		
	}

}
