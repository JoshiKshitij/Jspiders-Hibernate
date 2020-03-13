package com.crud.test;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_students")
public class StudentDto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String stream;

	@ManyToMany(mappedBy="students")
	private List<TeacherDto> teachers;

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

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public List<TeacherDto> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<TeacherDto> teachers) {
		this.teachers = teachers;
	}

	public StudentDto() {
		super();
		// TODO Auto-generated constructor stub
	}

}
