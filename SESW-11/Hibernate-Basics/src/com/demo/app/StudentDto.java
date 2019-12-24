package com.demo.app;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

// 1 
@Entity 								// 2
public class StudentDto implements Serializable {
	// 3
	// primary key
	@Id
	private int id;
	private String name;
	private double percentage;
	private String stream;

	// 4 encapsulation
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

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public StudentDto() {
	System.out.println("StudentDto created");
	}
	
	

}
