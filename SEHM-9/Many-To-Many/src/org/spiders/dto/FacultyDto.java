package org.spiders.dto;

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
@Table(name = "table_faculty")
public class FacultyDto implements Serializable {

	@Id
	@GenericGenerator(name = "abx", strategy = "increment")
	@GeneratedValue(generator = "abx")
	private int id;
	@Column(name = "faculty_name")
	private String name;

	@Column(name = "faculty_age")
	private int age;

	@Column(name = "teaching")
	private String teaching;

	@Column(name = "degree")
	private String degree;
	
	@ManyToMany
	List<StudentDto> listOfStudents;

	public FacultyDto() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTeaching() {
		return teaching;
	}

	public void setTeaching(String teaching) {
		this.teaching = teaching;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public List<StudentDto> getListOfStudents() {
		return listOfStudents;
	}

	public void setListOfStudents(List<StudentDto> listOfStudents) {
		this.listOfStudents = listOfStudents;
	}

}
