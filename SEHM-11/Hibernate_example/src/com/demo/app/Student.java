package com.demo.app;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

// 1st
@Entity						//2ND
public class Student implements Serializable {
	@Id // 3rd
 	private int rollNo;
	private String name;
	private String stream;
	
	
	// 4th
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
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
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", stream=" + stream + "]";
	}
	
	//5th
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
