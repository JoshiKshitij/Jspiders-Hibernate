package com.crud.test;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Runner {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();

		// teacher info
		TeacherDto shishiraSir = new TeacherDto();
		shishiraSir.setName("SHISHIRA SIR");
		shishiraSir.setSubjectClass("JAVA");

		TeacherDto vivekSir = new TeacherDto();
		vivekSir.setName("VIVEK SIR");
		vivekSir.setSubjectClass("JAVA");

		TeacherDto shambhuSir = new TeacherDto();
		shambhuSir.setName("SHAMBHU SIR");
		shambhuSir.setSubjectClass("APTI");

		TeacherDto raghuSir = new TeacherDto();
		raghuSir.setName("RAGHU SIR");
		raghuSir.setSubjectClass("PROGRAMMING");

		StudentDto abishek = new StudentDto();
		abishek.setName("ABHISHEK");
		abishek.setStream("CSE");

		StudentDto rakesh = new StudentDto();
		rakesh.setName("RAKESH");
		rakesh.setStream("EEE");

		StudentDto shamsher = new StudentDto();
		shamsher.setName("SHAMSHER");
		shamsher.setStream("CSE");

		StudentDto shashank = new StudentDto();
		shashank.setName("SHASHANK");
		shashank.setStream("ECE");

		StudentDto dhirendra = new StudentDto();
		dhirendra.setName("DHIRENDRA");
		dhirendra.setStream("CSE");

		// 4 list for teacher
		List<StudentDto> studentListForShishiraSir = Arrays.asList(rakesh, dhirendra, abishek);
		List<StudentDto> studentListForRaghuSir = Arrays.asList(rakesh, dhirendra, abishek, shamsher, shashank);
		List<StudentDto> studentListForShanbhuSir = Arrays.asList(rakesh, abishek);
		List<StudentDto> studentListForVivekSir = Arrays.asList(shashank);

		List<TeacherDto> listForAbishek = Arrays.asList(raghuSir, shambhuSir, shishiraSir);
		List<TeacherDto> listForRakesh = Arrays.asList(raghuSir, shambhuSir, shishiraSir);
		List<TeacherDto> listForShamSher = Arrays.asList(raghuSir);
		List<TeacherDto> listForShashank = Arrays.asList(raghuSir, vivekSir);
		List<TeacherDto> listForDhirendra = Arrays.asList(raghuSir, shishiraSir);

		// relation
		shishiraSir.setStudents(studentListForShishiraSir);
		raghuSir.setStudents(studentListForRaghuSir);
		shambhuSir.setStudents(studentListForShanbhuSir);
		vivekSir.setStudents(studentListForVivekSir);

		abishek.setTeachers(listForAbishek);
		dhirendra.setTeachers(listForDhirendra);
		shamsher.setTeachers(listForShamSher);
		shashank.setTeachers(listForShashank);
		rakesh.setTeachers(listForRakesh);

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(shishiraSir);
		session.save(raghuSir);
		session.save(vivekSir);
		session.save(shambhuSir);

		session.save(rakesh);
		session.save(abishek);
		session.save(shashank);
		session.save(shamsher);
		session.save(dhirendra);

		transaction.commit();
		session.close();
		sessionFactory.close();

	}
}
