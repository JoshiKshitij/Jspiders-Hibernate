package org.spiders;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "table_Liberary")
public class Liberary implements Serializable{
	
	@Id
	@GenericGenerator(name = "abc", strategy = "increment")
	@GeneratedValue(generator= "abc")
	private int id;
	
	@Column(name = "liberary_name")
	private String libNAme;
	
	@Column(name = "location")
	private String location;
	
	@OneToMany(mappedBy = "liberary")
	List<Books> listOfBooks = new ArrayList<Books>();


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getLibNAme() {
		return libNAme;
	}


	public void setLibNAme(String libNAme) {
		this.libNAme = libNAme;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public List<Books> getListOfBooks() {
		return listOfBooks;
	}


	public void setListOfBooks(List<Books> listOfBooks) {
		this.listOfBooks = listOfBooks;
	}
	
	
	
}
