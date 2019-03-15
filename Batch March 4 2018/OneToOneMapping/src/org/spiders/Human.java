package org.spiders;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "table_human")
public class Human implements Serializable{
	
	@Id
	@GeneratedValue
	@Column(name = "human_id")
	private int id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "human_age")
	private int age;
	
	@Column(name = "last_name")
	private String lastName;

	@OneToOne // fk 
	private Heart heart;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Human() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Human [id=" + id + ", firstName=" + firstName + ", age=" + age + ", lastName=" + lastName + "]";
	}

	public Heart getHeart() {
		return heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	
	
}
