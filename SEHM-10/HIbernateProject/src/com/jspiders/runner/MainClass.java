package com.jspiders.runner;

import com.jspiders.dao.StudentDao;
import com.jspiders.dto.StudentDto;

public class MainClass {

	
	public static void main(String[] args) {
		
		/*
		 * StudentDto rati = new StudentDto(); rati.setId(3);
		 * rati.setEmail("rati@gmail.com"); rati.setName("rati kaur");
		 * rati.setStream("cse");
		 * 
		 * StudentDto hemant = new StudentDto(); hemant.setId(4);
		 * hemant.setName("heman"); hemant.setStream("me");
		 * hemant.setEmail("hemant@hmail.com");
		 * 
		 * 
		 * StudentDao dao = new StudentDao(); dao.saveStudent(rati);
		 * dao.saveStudent(hemant);
		 */
		
		
		StudentDao dao = new StudentDao();
		/*
		 * StudentDto std = dao.fetchStudent(4); System.out.println(std);
		 */
		
		StudentDto s1 = new StudentDto();
		s1.setId(1);
		s1.setEmail("dingga.@gmail.com");
		s1.setName("dinga");
		s1.setStream("punjabi");
		
		
		
		dao.updateStudent(s1);
		
		
		
		
		
		
		
		
	}
}
