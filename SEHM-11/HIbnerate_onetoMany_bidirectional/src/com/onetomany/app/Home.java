package com.onetomany.app;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Home implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int hId;
	
	private String name;
	
	private String type;
	
	@ManyToOne
	Person person;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Home [hId=" + hId + ", name=" + name + ", type=" + type + "]";
	}



	public Home() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int gethId() {
		return hId;
	}

	public void sethId(int hId) {
		this.hId = hId;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	
	
}
