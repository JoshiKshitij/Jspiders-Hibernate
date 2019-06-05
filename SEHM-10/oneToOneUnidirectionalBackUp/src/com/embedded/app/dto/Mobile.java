package com.embedded.app.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Mobile {

	@Id
	// this annoation will assign the pk to the object 
	@GeneratedValue(generator ="abc")
	// this annotation will generte the pk for the object using 
	// sql (select max(id) from mobile table)
	@GenericGenerator(name = "abc"  , strategy = "increment")
	private int id;
	
	private String brand;
	private String batterySize;
	private String color;
	private String modelName;

	
	@OneToOne
	private SimCard sim;


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


	public String getBatterySize() {
		return batterySize;
	}


	public void setBatterySize(String batterySize) {
		this.batterySize = batterySize;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getModelName() {
		return modelName;
	}


	public void setModelName(String modelName) {
		this.modelName = modelName;
	}


	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}


	public SimCard getSim() {
		return sim;
	}


	public void setSim(SimCard sim) {
		this.sim = sim;
	}


	@Override
	public String toString() {
		return "Mobile [id=" + id + ", brand=" + brand + ", batterySize=" + batterySize + ", color=" + color
				+ ", modelName=" + modelName + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
