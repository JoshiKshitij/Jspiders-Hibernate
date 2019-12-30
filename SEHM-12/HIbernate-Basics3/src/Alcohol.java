import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alcohol implements Serializable {

	@Id
	@GeneratedValue
	(strategy= GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private double price;
	
	private String quantity;
	
	private String brand;

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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Alcohol() {
		super();
	}

	@Override
	public String toString() {
		return "Alcohol [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", brand="
				+ brand + "]";
	}
	
	
	
	
	


}

