package my.test;

public class Test {
	
	public static void main(String[] args) {
		MySingleton obj1 = MySingleton.getObject();
		MySingleton obj2 = MySingleton.getObject();
		
		System.out.println(obj1 ==obj2);
	}

}
