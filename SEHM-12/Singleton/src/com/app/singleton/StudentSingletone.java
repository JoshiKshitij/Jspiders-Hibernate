package com.app.singleton;

public class StudentSingletone {

	private final static Student s ;
	
	static {
		 s = new Student();
	}
	
	public synchronized 
		static 	
			Student getStudent(){
		return s;
	}

	private  StudentSingletone() {
		// TODO Auto-generated constructor stub
	}
	
}
