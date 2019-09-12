package com.hql.app;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_student" ) 
public class Student implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rollNo;
	
	@Column(name = "std_age" )
	private int age;
	
	@Column(name = "std_name" )
	private String name;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", age=" + age + ", name=" + name + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
