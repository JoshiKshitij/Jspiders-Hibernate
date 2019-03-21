package org.spiders.dto;

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
public class LiberaryDto implements Serializable{
	
	@Id
	@GenericGenerator(name = "abc", strategy = "increment")
	@GeneratedValue(generator= "abc")
	private int id;
	
	@Column(name = "liberary_name")
	private String libNAme;
	
	@Column(name = "location")
	private String location;
	
	@OneToMany(mappedBy = "liberary")
	List<BooksDto> listOfBooks = new ArrayList<BooksDto>();


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


	public List<BooksDto> getListOfBooks() {
		return listOfBooks;
	}


	public void setListOfBooks(List<BooksDto> listOfBooks) {
		this.listOfBooks = listOfBooks;
	}
	
	
	
}
