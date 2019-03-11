package org.spiders;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Laptop implements Serializable{
	
	@Column(name = "laptop_ram")
	private String ram;
	
	private String hardDriverSpace;

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getHardDriverSpace() {
		return hardDriverSpace;
	}

	public void setHardDriverSpace(String hardDriverSpace) {
		this.hardDriverSpace = hardDriverSpace;
	}

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
