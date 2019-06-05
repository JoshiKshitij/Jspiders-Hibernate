package com.embedded.app.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "table_teachers")
public class TeacherDto implements Serializable {

	@Id
	@GeneratedValue(generator = "inc")
	@GenericGenerator(name = "inc", strategy = "increment")
	private long id;

	@Column(name = "teacher_name")
	private String name;

	@Column(name = "subject_he_teaches")
	private String subjectHeTeaches;

	@Column(name = "experience")
	private String experience;

	@ManyToMany
	List<StudentDto> listOfStudents;

	public TeacherDto() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubjectHeTeaches() {
		return subjectHeTeaches;
	}

	public void setSubjectHeTeaches(String subjectHeTeaches) {
		this.subjectHeTeaches = subjectHeTeaches;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public List<StudentDto> getListOfStudents() {
		return listOfStudents;
	}

	public void setListOfStudents(List<StudentDto> listOfStudents) {
		this.listOfStudents = listOfStudents;
	}

	@Override
	public String toString() {
		return "TeacherDto [id=" + id + ", name=" + name + ", subjectHeTeaches=" + subjectHeTeaches + ", experience="
				+ experience + ", listOfStudents=" + listOfStudents + "]";
	}

}
