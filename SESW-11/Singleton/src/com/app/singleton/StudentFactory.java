package com.app.singleton;

public class StudentFactory {
	
	public static 
	Student getStudent(){
	Student s = new Student();
	return s;
	}
	
	private StudentFactory() {
		
	}
	
}
