package com.crud.test;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
// for changing the name of table and extra stuff
@Table(name = "tbl_Movies" )
public class MovieDto implements Serializable {

	// for PK
	@Id
	// automatic generation of PK
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// for changing name of column and extra stuff
	@Column(name = "movie_id")
	private long id;
	
	@Column(name = "movie_rating")
	private String rating;
	
	@Column(name = "movie_main_actor" )
	private String mainActor;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getMainActor() {
		return mainActor;
	}

	public void setMainActor(String mainActor) {
		this.mainActor = mainActor;
	}

	public MovieDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MovieDto [id=" + id + ", rating=" + rating + ", mainActor=" + mainActor + "]";
	}

}
