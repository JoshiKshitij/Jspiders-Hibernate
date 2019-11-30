package com.basic.app;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveDao {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		// before u write further go to hibrenate.cfg.xml for mapping
		cfg.configure();

		SessionFactory sessionFactory = cfg.buildSessionFactory();

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		// create 3 teachers
		TeacherDto shishiraSir = new TeacherDto();
		shishiraSir.setName("ShiShira Sir");
		shishiraSir.setTeachersSubject("Java");

		TeacherDto nikhilaMam = new TeacherDto();
		nikhilaMam.setName("Nikhila MaM");
		nikhilaMam.setTeachersSubject("SQL");

		TeacherDto djSir = new TeacherDto();
		djSir.setName("DJ Sir");
		djSir.setTeachersSubject("SQL");

		// crreate 5 student Objects
		StudentDto yash = new StudentDto();
		yash.setName("Yash");
		yash.setStream("cse");
		yash.setMobileNo("9876766789");

		StudentDto sai = new StudentDto();
		sai.setName("Sai");
		sai.setStream("ece");
		sai.setMobileNo("9000006789");

		StudentDto manju = new StudentDto();
		manju.setName("Manju");
		manju.setStream("it");
		manju.setMobileNo("7906766789");

		StudentDto datta = new StudentDto();
		datta.setName("Datta");
		datta.setStream("ece");
		datta.setMobileNo("9876766789");

		StudentDto rishab = new StudentDto();
		rishab.setName("Rishab");
		rishab.setStream("eee");
		rishab.setMobileNo("6655686789");

		// list for Teacher
		List<StudentDto> studentListForShishirSir = new ArrayList();
		studentListForShishirSir.add(yash);
		studentListForShishirSir.add(sai);
		studentListForShishirSir.add(manju);
		studentListForShishirSir.add(datta);
		studentListForShishirSir.add(rishab);
		
		List<StudentDto> studentListForDjSir = new ArrayList();
		studentListForDjSir.add(manju);
		studentListForDjSir.add(datta);
		
		List<StudentDto> studentListForNikhilaMam = new ArrayList();
		studentListForNikhilaMam.add(yash);
		studentListForNikhilaMam.add(sai);
		
		// 5 list for students
		List<TeacherDto> teacherListForYash = new ArrayList();
		teacherListForYash.add(nikhilaMam);
		teacherListForYash.add(shishiraSir);
		
		List<TeacherDto> teacherListForSai = new ArrayList();
		teacherListForSai.add(nikhilaMam);
		teacherListForSai.add(shishiraSir);
		
		List<TeacherDto> teacherListForManju = new ArrayList();
		teacherListForManju.add(djSir);
		teacherListForManju.add(shishiraSir);
		
		List<TeacherDto> teacherListForDatta = new ArrayList();
		teacherListForDatta.add(djSir);
		teacherListForDatta.add(shishiraSir);
		
		List<TeacherDto> teacherListForRishab = new ArrayList();
		teacherListForRishab.add(shishiraSir);
		
		//relationship
		nikhilaMam.setStudents(studentListForNikhilaMam);
		djSir.setStudents(studentListForDjSir);
		shishiraSir.setStudents(studentListForShishirSir);
		
		yash.setTeachers(teacherListForYash);
		sai.setTeachers(teacherListForSai);
		manju.setTeachers(teacherListForManju);
		datta.setTeachers(teacherListForDatta);
		rishab.setTeachers(teacherListForRishab);
		
		session.save(shishiraSir);
		session.save(djSir);
		session.save(nikhilaMam);
		session.save(yash);
		session.save(sai);
		session.save(manju);
		session.save(datta);
		session.save(rishab);
		
		transaction.commit();
		
		session.close();
		sessionFactory.close();
		
		
	}

}
