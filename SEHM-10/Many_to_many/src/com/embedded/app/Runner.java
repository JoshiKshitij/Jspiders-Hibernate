package com.embedded.app;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.embedded.app.dto.StudentDto;
import com.embedded.app.dto.TeacherDto;



public class Runner {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session =  factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		
		TeacherDto kshitij = new TeacherDto();
		kshitij.setExperience("unknown");
		kshitij.setName("Kshitij Joshi");
		kshitij.setSubjectHeTeaches("Spring / Hibernate");
		
		
		TeacherDto shishiraSir = new TeacherDto();
		shishiraSir.setExperience("1000 years");
		shishiraSir.setName("Shishir Sir Ji");
		shishiraSir.setSubjectHeTeaches("Java");
		
		
		TeacherDto raghuSir = new TeacherDto();
		raghuSir.setExperience("1000 years");
		raghuSir.setName("Raghu Sir jii");
		raghuSir.setSubjectHeTeaches("Programming");
		
		
		
		
		StudentDto hitler = new StudentDto();
		hitler.setName("Adolf Hitler");
		hitler.setStars("*****");
		hitler.setCourse("Java / Programming");
		
		
		
		StudentDto ghandiJi = new StudentDto();
		ghandiJi.setName("MOhan Das karamChand Ghandhi JI");
		ghandiJi.setStars("***");
		ghandiJi.setCourse("Java");
		
		StudentDto shubham = new StudentDto();
		shubham.setName("Shubham");
		shubham.setStars("****");
		shubham.setCourse("Java / Programming / Spring - hibernate" );
		
		StudentDto kavya = new StudentDto();
		kavya.setName("kavya");
		kavya.setStars("*****");
		kavya.setCourse("Java / Spring - hibernate");
		
		
		
		// list of students for teachers
		
		List<StudentDto> listForKshitij = new ArrayList<StudentDto>();
		listForKshitij.add(shubham);
		listForKshitij.add(kavya);
		kshitij.setListOfStudents(listForKshitij);
		
		
		List<StudentDto> listForShishirSir = new ArrayList<StudentDto>();
		listForShishirSir.add(shubham);
		listForShishirSir.add(kavya);
		listForShishirSir.add(hitler);
		listForShishirSir.add(ghandiJi);
		shishiraSir.setListOfStudents(listForShishirSir);
		
		List<StudentDto> listForRaghuSir = new ArrayList<StudentDto>();
		listForRaghuSir.add(hitler);
		listForRaghuSir.add(shubham);
		raghuSir.setListOfStudents(listForRaghuSir);
		
		
		
		// list of techers for studeent;
		List<TeacherDto> teacherListForShubham = new ArrayList<TeacherDto>();
		teacherListForShubham.add(shishiraSir);
		teacherListForShubham.add(raghuSir);
		teacherListForShubham.add(kshitij);
		shubham.setListOfTeacher(teacherListForShubham);
		
		
		List<TeacherDto> teacherListForHitler = new ArrayList<TeacherDto>();
		teacherListForHitler.add(shishiraSir);
		teacherListForHitler.add(raghuSir);
		hitler.setListOfTeacher(teacherListForHitler);
		
		
		List<TeacherDto> teacherListForKavya = new ArrayList<TeacherDto>();
		teacherListForKavya.add(kshitij);
		teacherListForKavya.add(shishiraSir);
		kavya.setListOfTeacher(teacherListForKavya);
		
		List<TeacherDto> teacherListForGhandiJI = new ArrayList<TeacherDto>();
		teacherListForGhandiJI.add(shishiraSir);
		ghandiJi.setListOfTeacher(teacherListForGhandiJI);
		
		
		
		session.save(kshitij);
		session.save(shishiraSir);
		session.save(raghuSir);
		session.save(shubham);
		session.save(kavya);
		session.save(hitler);
		session.save(ghandiJi);
		
		transaction.commit();
		
		factory.close();
		session.close();        
		
		
		
		
		
	
	}
}
