package com.single.demo;

public class Student {

	private static Student s;

	static {
		s = new Student();
	}

	private Student() {
		System.out.println("studnt onbject created");
	}

	public static synchronized Student getStudentObject() {
		return s;
	}

}
