package com.app.singleton;

public class Runner {

	public static void main(String[] args) {
		
		Student s1 = 
				StudentFactory.getStudent();
		Student s2 =
				StudentFactory.getStudent();
		
		Student s3 =
				StudentSingletone.getStudent();
		Student s4 = 
				StudentSingletone.getStudent();
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);

	}
}
