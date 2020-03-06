package com.single.demo;

public class Runner {

	public static void main(String[] args) {

		Student s1 = Student.getStudentObject();
		Student s2 = Student.getStudentObject();
		
		
		System.out.println(s1== s2);
		System.out.println(s1.equals(s2));
	}

}
