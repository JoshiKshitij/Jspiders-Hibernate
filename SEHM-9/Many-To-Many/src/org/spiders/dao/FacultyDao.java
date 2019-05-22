package org.spiders.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.spiders.dto.FacultyDto;
import org.spiders.dto.StudentDto;

import com.spiders.HibernateUtil;

import antlr.collections.impl.LList;

public class FacultyDao {
	
	
	public int saveFacultyandStudents(List<FacultyDto> listOfFaculty , List<StudentDto>litOfStudents){
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		
			
		for (StudentDto student : litOfStudents) {
			session.save(student);
		}
		
		for (FacultyDto faculty : listOfFaculty) {
			session.save(faculty);
		}
		
		session.getTransaction().commit();
		session.close();
		return 0;
	}

}
