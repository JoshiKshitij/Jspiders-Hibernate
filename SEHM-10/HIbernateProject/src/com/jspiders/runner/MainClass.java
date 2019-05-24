package com.jspiders.runner;

import com.jspiders.dao.StudentDao;
import com.jspiders.dto.StudentDto;

public class MainClass {

	
	public static void main(String[] args) {
		
		StudentDto kshitij = new StudentDto();
		kshitij.setId(1);
		kshitij.setEmail("kj@gmail.com");
		kshitij.setName("Kshitij joshi");
		kshitij.setStream("ece");
		
		StudentDto karan = new StudentDto(); 
		karan.setId(2);
		karan.setName("karan");
		karan.setStream("cse");
		karan.setEmail("karan@hmail.com");
		
		
		StudentDao dao = new StudentDao();
		dao.saveStudent(kshitij);
		dao.saveStudent(karan);
		
		
		
		
		
		
		
	}
}
