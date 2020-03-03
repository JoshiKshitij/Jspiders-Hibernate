package com.test.basic;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

// all the basic annotation will come from javax.persiatnce package

@Entity
public class StudentDto implements Serializable {

	@Id
	private int rollNo;
	private String name;
	private String stream;

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

	public StudentDto() {
		// user defined non-args constructor
	}

	@Override
	public String toString() {
		return "StudentDto [rollNo=" + rollNo + ", name=" + name + ", stream=" + stream + "]";
	}

	void thisWord(){
		try {
			StudentDto sd = (StudentDto) this.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
