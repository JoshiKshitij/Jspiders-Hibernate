package com.basic.app;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_collages")
public class CollageDto  implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "collage_name")
	private  String name ;
	
	@Column(name = "collage_address")
	private  String address ;
	
	@Column(name = "no_of_students")
	private  int noOfStudenrts ;

	@Column(name = "no_of_teachers")
	private  int noOfTeachers ;

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


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getNoOfStudenrts() {
		return noOfStudenrts;
	}


	public void setNoOfStudenrts(int noOfStudenrts) {
		this.noOfStudenrts = noOfStudenrts;
	}


	public int getNoOfTeachers() {
		return noOfTeachers;
	}


	public void setNoOfTeachers(int noOfTeachers) {
		this.noOfTeachers = noOfTeachers;
	}


	public CollageDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
}
