package com.embedded.app.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class SimCard {

	@Id
	// this annoation will assign the pk to the object
	@GeneratedValue(generator = "abc")
	// this annotation will generte the pk for the object using
	// sql (select max(id) from mobile table)
	@GenericGenerator(name = "abc", strategy = "increment")
	private int id;

	private String company;
	private String mobileNo;
	private String size;

	@OneToOne(mappedBy = "sim")
	private Mobile mobile;
	
	public SimCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SimCard [id=" + id + ", company=" + company + ", mobileNo=" + mobileNo + ", size=" + size + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Mobile getMobile() {
		return mobile;
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}

}
