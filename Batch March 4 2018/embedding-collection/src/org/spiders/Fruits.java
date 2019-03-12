package org.spiders;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Fruits implements Serializable{

	private int noOfSeeds;
	private String color;

	public int getNoOfSeeds() {
		return noOfSeeds;
	}

	public void setNoOfSeeds(int noOfSeeds) {
		this.noOfSeeds = noOfSeeds;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Fruits [noOfSeeds=" + noOfSeeds + ", color=" + color + "]";
	}

	public Fruits() {
		super();
		// TODO Auto-generated constructor stub
	}

}
