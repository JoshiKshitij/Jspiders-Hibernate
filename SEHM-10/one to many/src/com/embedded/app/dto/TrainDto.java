package com.embedded.app.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "table_trains")
public class TrainDto {
	
	@Id
	// this will assign the pk to the passanger object 
	@GeneratedValue(generator = "kshitij")
	
	// this will create a statemt as (slect max(id ) from passanger tabe)
	@GenericGenerator(name = "kshitij", strategy = "increment")
	private int id;

	@Column(name= "t_name")
	private String name;

	@Column(name= "t_train_no")
	private String trainNO;

	@Column(name= "t_no_of_coaches")
	private String noOfcoaches;

	@OneToMany
	List<PassangerDto> listOfPassangers;


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


	public String getTrainNO() {
		return trainNO;
	}


	public void setTrainNO(String trainNO) {
		this.trainNO = trainNO;
	}


	public String getNoOfcoaches() {
		return noOfcoaches;
	}


	public void setNoOfcoaches(String noOfcoaches) {
		this.noOfcoaches = noOfcoaches;
	}


	public List<PassangerDto> getListOfPassangers() {
		return listOfPassangers;
	}


	public void setListOfPassangers(List<PassangerDto> listOfPassangers) {
		this.listOfPassangers = listOfPassangers;
	}


	@Override
	public String toString() {
		return "TrainDto [id=" + id + ", name=" + name + ", trainNO=" + trainNO + ", noOfcoaches=" + noOfcoaches + "]";
	}


	public TrainDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
