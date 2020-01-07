package com.mamytomamy.app;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student implements Serializable {
	@Id
	@GeneratedValue
	(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	private char gender;

	@ManyToMany
	List<Teacher> teachers;

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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
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
