
public class MyClass {
	
	private static MyClass mc = null;
	
	static {
		System.out.println(" befor inti my object " +  mc);
		System.out.println("static block exicuted");
		mc = new MyClass();
		System.out.println("after init my object " + mc);
	}
	
	public static MyClass getObject() {
		if(mc == null) {
			mc = new MyClass();
		}
		return mc;
	}

	private  MyClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
