package com.jspdiers.crud;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name ="qwertyu")
public class Institute implements Serializable {
	
	@Id
	private int id;
	
	@Column(name = "Ins_name")
	
	private String name;
	
	private double fee;

	public Institute() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Institute [id=" + id + ", name=" + name + ", fee=" + fee + "]";
	}
	
	
	
	
	
	
	
	
}
