package com.crud.test;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_boy")
public class BoyDto  implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private int age;
	
	@OneToOne
	private GirlDto girl;

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

	public GirlDto getGirl() {
		return girl;
	}

	public void setGirl(GirlDto girl) {
		this.girl = girl;
	}

	public BoyDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BoyDto [id=" + id + ", name=" + name + ", age=" + age + ", girl=" + girl + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
