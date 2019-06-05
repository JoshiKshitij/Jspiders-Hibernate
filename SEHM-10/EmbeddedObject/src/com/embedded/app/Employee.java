package com.embedded.app;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;


@Entity
public class Employee implements Serializable {
	
	@Id
	// below two annotatinonn are used for automatic generationn of primary key by hibernate
	@GeneratedValue(generator= "xr")
	@GenericGenerator(name = "xr" , strategy="increment")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "depatment")
	private String dept;
	
	@Embedded // @onetTOne
	private Address address;


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


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", address=" + address + "]";
	}

	
	
}
