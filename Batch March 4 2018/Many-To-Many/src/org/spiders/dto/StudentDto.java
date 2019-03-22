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
@Table(name = "table_student")
public class StudentDto implements Serializable{
	
	@Id
	@GenericGenerator(name = "abx" , strategy= "increment")
	@GeneratedValue(generator="abx")
	private int id ;
	
	@Column(name = "student_name")
	private String name ;
	
	@Column(name = "student_age")
	private int age;
	
	@Column(name = "studing_in")
	private String studingIn;
	
	@ManyToMany(mappedBy ="listOfStudents")
	List<FacultyDto> listOfFaculties;

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

	public String getStudingIn() {
		return studingIn;
	}

	public void setStudingIn(String studingIn) {
		this.studingIn = studingIn;
	}

	public List<FacultyDto> getListOfFaculties() {
		return listOfFaculties;
	}

	public void setListOfFaculties(List<FacultyDto> listOfFaculties) {
		this.listOfFaculties = listOfFaculties;
	}

	public StudentDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
