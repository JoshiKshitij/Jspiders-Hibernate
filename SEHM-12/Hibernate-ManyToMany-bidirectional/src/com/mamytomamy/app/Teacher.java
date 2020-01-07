package com.mamytomamy.app;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Teacher implements Serializable {
	@Id
	@GeneratedValue
	(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	private String teachesSubject;

	@ManyToMany(mappedBy="teachers")
	List<Student> students;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeachesSubject() {
		return teachesSubject;
	}

	public void setTeachesSubject(String teachesSubject) {
		this.teachesSubject = teachesSubject;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
}
