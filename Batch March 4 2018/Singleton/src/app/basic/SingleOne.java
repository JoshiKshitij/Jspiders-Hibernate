package app.basic;

public class SingleOne {
	
	
	private static SingleOne one = null;

	private SingleOne() {
		System.out.println("Object created for SingleONe");
	}

	static {
		one = new SingleOne();
	}

	static public SingleOne getObject() {
		if (one == null) {
			one = new SingleOne();
		}
		return one;
	}

}
