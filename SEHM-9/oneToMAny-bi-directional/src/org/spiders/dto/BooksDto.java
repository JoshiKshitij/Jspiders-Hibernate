package org.spiders.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "table_books")
public class BooksDto implements Serializable {

	@Id
	@GenericGenerator(name = "abc", strategy = "increment")
	@GeneratedValue(generator = "abc")
	private int id;

	@Column(name = "author_name")
	private String author;

	@Column(name = "book_name")
	private String name;
	
	
	@ManyToOne
	LiberaryDto liberary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BooksDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LiberaryDto getLiberary() {
		return liberary;
	}

	public void setLiberary(LiberaryDto liberary) {
		this.liberary = liberary;
	}

}
