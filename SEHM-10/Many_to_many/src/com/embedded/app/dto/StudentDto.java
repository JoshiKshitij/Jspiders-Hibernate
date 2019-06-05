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
@Table(name = "table_students")
public class StudentDto implements Serializable {

	@Id
	@GeneratedValue(generator = "inc")
	@GenericGenerator(name = "inc", strategy = "increment")
	private long id;

	@Column(name = "student_name")
	private String name;

	@Column(name = "course")
	private String course;

	@Column(name = "student_stars")
	private String stars;

	@ManyToMany
	List<TeacherDto> listOfTeacher;

	public StudentDto() {
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

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getStars() {
		return stars;
	}

	public void setStars(String stars) {
		this.stars = stars;
	}

	public List<TeacherDto> getListOfTeacher() {
		return listOfTeacher;
	}

	public void setListOfTeacher(List<TeacherDto> listOfTeacher) {
		this.listOfTeacher = listOfTeacher;
	}

	@Override
	public String toString() {
		return "StudentDto [id=" + id + ", name=" + name + ", course=" + course + ", stars=" + stars
				+ ", listOfTeacher=" + listOfTeacher + "]";
	}

}
