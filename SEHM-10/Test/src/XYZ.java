
public class XYZ {
	
	public static void main(String[] args) {
		/*
		 * try { Class.forName("MyClass"); System.out.println("class loaded"); } catch
		 * (ClassNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		
		
		
		  MyClass m1 = MyClass.getObject(); MyClass m2 = MyClass.getObject();
		  
		  System.out.println(m1 == m2);
		 
	
	
	}

}
