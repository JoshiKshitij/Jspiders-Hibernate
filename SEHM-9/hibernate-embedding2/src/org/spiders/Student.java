package org.spiders;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_laptop_table")
// 1st step
public class Student implements Serializable {

	@Id // 2nd step
	@GeneratedValue
	private int id;

	@Column(name = "student_name")
	private String stdName;

	private String stdStream;

	@Embedded
	private Laptop laptop;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getStdStream() {
		return stdStream;
	}

	public void setStdStream(String stdStream) {
		this.stdStream = stdStream;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", stdName=" + stdName + ", stdStream=" + stdStream + ", laptop=" + laptop + "]";
	}

	
}
