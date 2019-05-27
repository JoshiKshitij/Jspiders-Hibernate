package com.jspiders.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "table_student")
public class StudentDto implements Serializable{

	@Id
	@Column(name = "pk_id")
	private int id;
	
	@Column(name = "std_email")
	private String email;
	
	@Column(name = "std_name")
	private String name;
	
	@Column(name = "std_stream")
	private String stream;


	public StudentDto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
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
		return "StudentDto [id=" + id + ", email=" + email + ", name=" + name + ", stream=" + stream + "]";
	}
	
	
	
	
}
