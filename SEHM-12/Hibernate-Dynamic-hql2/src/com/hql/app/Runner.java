package com.hql.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import singleton.app.HibernteUtil;

public class Runner {
	
	public static void main(String[] args) {
		
	StudentDao dao = new StudentDao();
	StudentDto studentDto = dao.findByName("Kshitij joshi");
	System.out.println(studentDto);
	
	
	
		
	}

}
