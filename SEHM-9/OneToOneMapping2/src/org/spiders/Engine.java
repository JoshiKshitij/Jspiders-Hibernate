package org.spiders;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "table_engine")
public class Engine implements Serializable {
	
	@Id
	@GeneratedValue(generator = "inc")
	@GenericGenerator(name = "inc", strategy = "increment")
	@Column(name = "engine_id")
	private int id;
	
	@Column(name = "vehicle_cc")
	private String cc;
	
	@Column(name = "vehicle_ho")
	private String hp;
	
	@OneToOne
	@JoinColumn(name = "vech_id") // to chnage fk column name
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

	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "Engine [id=" + id + ", cc=" + cc + ", hp=" + hp + ", vehicle=" + vehicle + "]";
	}
	
	
	
}
