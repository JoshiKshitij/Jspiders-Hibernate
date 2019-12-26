import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
//1 rule
@Entity						// 2nd rule
public class Mobile implements Serializable {

	// 3rd rule
	@Id
	private int id;
	
	private String brand;
	private int ramSize;
	private double price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRamSize() {
		return ramSize;
	}
	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	private Mobile() {
	super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
