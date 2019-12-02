package com.jspiders.app;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_alcohol")
public class AlcoholDto implements Serializable {
	@Id
	@GeneratedValue
	(strategy = 
	GenerationType.IDENTITY)
	private int id ;
	
	@Column(name = "alc_brand" )
	private String brand;
	
	@Column(name = "alc_content")
	private double achoholContent;
	
	@Column(name = "alc_price")
	private int price;
	
	private AlcoholDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Column(name = "alc_quantity")
	private int quantity;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getAchoholContent() {
		return achoholContent;
	}

	public void setAchoholContent(double achoholContent) {
		this.achoholContent = achoholContent;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public AlcoholDto(int i) {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AlcoholDto [id=" + id + ", brand=" + brand + ", achoholContent=" + achoholContent + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
	
	
	
}
