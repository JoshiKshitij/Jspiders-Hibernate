package com.embedded.app;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "table_cartoons")
public class CartoonDto implements Serializable{

	@Id
	@GenericGenerator(name = "inc" , strategy = "increment")
	@GeneratedValue(generator= "inc")
	private long id;
	
	private String name;
	
	private String rating;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public CartoonDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CartoonDto(String name, String rating) {
		super();
		this.name = name;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "CartoonDto [id=" + id + ", name=" + name + ", rating=" + rating + "]";
	}
	
	
	
	
	
	
	
	
	
}
