package com.embedded.app.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Engine implements Serializable {

	@Id
	@GeneratedValue(generator = "kshitij")
	@GenericGenerator(name = "kshitij", strategy = "increment")
	private int id;

	private String cc;

	private String hp;

	private String brand;
	
	@OneToOne(mappedBy = "engine")
	Vehicle vehicle;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Engine [id=" + id + ", cc=" + cc + ", hp=" + hp + ", brand=" + brand + "]";
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

}
