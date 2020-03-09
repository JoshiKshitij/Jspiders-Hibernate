package com.crud.test;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_country_pms")
public class PrimeMinisterDto implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String becamePmIn;
	private int age;

	@OneToOne // fk from CountryDto tble
	private CountryDto country;

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

	public String getBecamePmIn() {
		return becamePmIn;
	}

	public void setBecamePmIn(String becamePmIn) {
		this.becamePmIn = becamePmIn;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public CountryDto getCountry() {
		return country;
	}

	public void setCountry(CountryDto country) {
		this.country = country;
	}

	public PrimeMinisterDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PrimeMinisterDto [id=" + id + ", name=" + name + ", becamePmIn=" + becamePmIn + ", age=" + age
				+ ", country=" + country + "]";
	}

}