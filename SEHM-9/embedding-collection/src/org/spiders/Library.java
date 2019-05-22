package org.spiders;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "table_library")
public class Library implements Serializable{
	
	@Id
	@GeneratedValue // auto genertion of PK
	private long id ;
	
	@Column(name= "library_name")
	private String name;
	
	@Column(name= "librarian_name")
	private String librarianName;
	
	@ElementCollection
	List<Books> listOfBooks;

	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	public String getLibrarianName() {
		return librarianName;
	}

	public void setLibrarianName(String librarianName) {
		this.librarianName = librarianName;
	}

	public List<Books> getListOfBooks() {
		return listOfBooks;
	}

	public void setListOfBooks(List<Books> listOfBooks) {
		this.listOfBooks = listOfBooks;
	}

	@Override
	public String toString() {
		return "Library [id=" + id + ", name=" + name + ", librarianName=" + librarianName + ", listOfBooks="
				+ listOfBooks + "]";
	}
	
	
}
