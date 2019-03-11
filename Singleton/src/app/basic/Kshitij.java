package app.basic;

public class Kshitij {
	
	public static void main(String[] args) {
		SingleOne one = SingleOne.getObject();
		SingleOne two = SingleOne.getObject();

		SingleOne three = SingleOne.getObject();

		System.out.println(one == two );
		
	}
}
