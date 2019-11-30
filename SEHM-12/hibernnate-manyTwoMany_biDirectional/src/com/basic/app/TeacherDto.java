package com.basic.app;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_Teacher")
public class TeacherDto implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "name")
	private String name;
	
	@Column(name = "teachers_subject")
	private String teachersSubject;

	@ManyToMany(mappedBy = "teachers")
	private List<StudentDto> students;

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

	public String getTeachersSubject() {
		return teachersSubject;
	}

	public void setTeachersSubject(String teachersSubject) {
		this.teachersSubject = teachersSubject;
	}

	public List<StudentDto> getStudents() {
		return students;
	}

	public void setStudents(List<StudentDto> students) {
		this.students = students;
	}

	public  TeacherDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	


}
