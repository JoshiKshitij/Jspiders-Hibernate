package com.embedded.app.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "tabe_passanger")
public class PassangerDto implements Serializable {


	@Id
	// this will assign the pk to the passanger object 
	@GeneratedValue(generator = "kshitij")
	
	// this will create a statemt as (slect max(id ) from passanger tabe)
	@GenericGenerator(name = "kshitij", strategy = "increment")
	private int id;

	@Column(name= "p_name")
	private String name;

	@Column(name= "p_mobile_no")
	private String mobileNo;

	@Column(name= "p_email")
	private String email;
	
	@ManyToOne
	TrainDto trainDto;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public TrainDto getTrainDto() {
		return trainDto;
	}

	public void setTrainDto(TrainDto trainDto) {
		this.trainDto = trainDto;
	}

	@Override
	public String toString() {
		return "PassangerDto [id=" + id + ", name=" + name + ", mobileNo=" + mobileNo + ", email=" + email + "]";
	}

	public PassangerDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
