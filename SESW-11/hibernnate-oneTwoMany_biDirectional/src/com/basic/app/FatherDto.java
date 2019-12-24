package com.basic.app;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_father")
public class FatherDto implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "mobile_no")
	private String mobileNo;
	
	@Column(name = "marital_status")
	private boolean maritalStatus;
	
	@OneToMany(mappedBy = "father" , fetch = FetchType.EAGER)
	List<SonDto> listOfSons;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public boolean isMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(boolean maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public List<SonDto> getListOfSons() {
		return listOfSons;
	}

	public void setListOfSons(List<SonDto> listOfSons) {
		this.listOfSons = listOfSons;
	}

	public FatherDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "FatherDto [id=" + id + ", name=" + name + ", mobileNo=" + mobileNo + ", maritalStatus=" + maritalStatus
				+ ", listOfSons=" + listOfSons + "]";
	}
	
	
	
	

}
