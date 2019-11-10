package com.basic.app;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MovieDto implements Serializable{

	@Id
	// auto genreation of id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	private int id;
	private String name;
	private String stars;
	
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
	public String getStars() {
		return stars;
	}
	public void setStars(String stars) {
		this.stars = stars;
	}
	public MovieDto() {
		System.out.println("movie created");
		
	}
	
	
	
	
	
	
	
}
