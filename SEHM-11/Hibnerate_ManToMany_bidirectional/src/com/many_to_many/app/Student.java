package com.many_to_many.app;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Student implements Serializable {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int studentId;
	
	private String name ;
	
	// eager 
	@ManyToMany
	List<Teacher> teachers = new ArrayList<Teacher>();

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
}
