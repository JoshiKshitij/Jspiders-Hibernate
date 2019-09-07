package com.singleton.factory;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rollNo;
	private int age;
	private String name;
	
	@Embedded
	private Address address;
	

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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
