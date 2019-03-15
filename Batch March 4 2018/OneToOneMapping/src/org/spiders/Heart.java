package org.spiders;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity // tell hibernate this class has to mapped to a table
@Table(name ="table_heart") // giving our own name to table
public class Heart implements Serializable {
	
	@Id
	@GeneratedValue
	@Column(name = "heart_id")
	private int id;
	
	@Column(name = "beats_per_min")
	private int beatsPerMin;
	
	@Column(name = "has_disease")
	private boolean hasDisease;
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBeatsPerMin() {
		return beatsPerMin;
	}

	public void setBeatsPerMin(int beatsPerMin) {
		this.beatsPerMin = beatsPerMin;
	}

	public boolean isHasDisease() {
		return hasDisease;
	}

	public void setHasDisease(boolean hasDisease) {
		this.hasDisease = hasDisease;
	}

	public Heart() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Heart [id=" + id + ", beatsPerMin=" + beatsPerMin + ", hasDisease=" + hasDisease + "]";
	}

	
}
