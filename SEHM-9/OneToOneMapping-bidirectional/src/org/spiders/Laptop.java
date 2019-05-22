package org.spiders;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "table_laptop")
public class Laptop implements Serializable{
	
	@Id
	@GeneratedValue(generator = "up")
	@GenericGenerator(name = "up" , strategy= "increment")
	private int id ;
	
	@Column(name = "ram_size")
	private String ramSize;
	
	@Column(name = "model_no")
	private String model;
		
	@Column(name = "brand")
	private String make;
	
	@OneToOne(mappedBy = "laptop") // htis tbale will not have FK
	Charger charger;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRamSize() {
		return ramSize;
	}

	public void setRamSize(String ramSize) {
		this.ramSize = ramSize;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public Charger getCharger() {
		return charger;
	}

	public void setCharger(Charger charger) {
		this.charger = charger;
	}

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
