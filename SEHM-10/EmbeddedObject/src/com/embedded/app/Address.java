package com.embedded.app;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

	//@Column(name = "emp_city")
	private String city;

	private String state;
	
	private String pincode;
	
	private String street;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pincode=" + pincode + ", street=" + street + "]";
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
