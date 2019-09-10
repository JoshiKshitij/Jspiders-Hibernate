package com.singleton.factory;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Girl implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int gId;
	
	private String name;
	
	private int   age;
	
	@OneToOne(mappedBy = "girl")
	Boy boy ;

	public int getgId() {
		return gId;
	}

	public void setgId(int gId) {
		this.gId = gId;
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

	public Girl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Girl [gId=" + gId + ", name=" + name + ", age=" + age + "]";
	}

	public Boy getBoy() {
		return boy;
	}

	public void setBoy(Boy boy) {
		this.boy = boy;
	}
	
	
	
	
	
	
}
