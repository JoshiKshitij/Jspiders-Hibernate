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
public class Teacher implements Serializable {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int teacherId;
	
	private String name ;
	

	@ManyToMany
	List<Student> students = new ArrayList<Student>();

	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
}
