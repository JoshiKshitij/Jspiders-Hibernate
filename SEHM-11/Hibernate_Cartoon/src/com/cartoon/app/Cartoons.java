package com.cartoon.app;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cartoons implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cartoonId;
	
	private String cartoonName;
	private String favChar;
	
	public int getCartoonId() {
		return cartoonId;
	}
	public void setCartoonId(int cartoonId) {
		this.cartoonId = cartoonId;
	}
	public String getCartoonName() {
		return cartoonName;
	}
	public void setCartoonName(String cartoonName) {
		this.cartoonName = cartoonName;
	}
	public String getFavChar() {
		return favChar;
	}
	public void setFavChar(String favChar) {
		this.favChar = favChar;
	}
	public Cartoons() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Cartoons [cartoonId=" + cartoonId + ", cartoonName=" + cartoonName + ", favChar=" + favChar + "]";
	}

}
