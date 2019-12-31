package singleton;

public class Runner {
	
	public static void main(String[] args) {
		
		Student s1 = Student.studentFactory();
		Student s2 = Student.studentFactory();
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		
	}

}
