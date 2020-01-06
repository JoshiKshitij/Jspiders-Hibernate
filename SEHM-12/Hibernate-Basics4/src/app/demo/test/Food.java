package app.demo.test;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// 1. this provides meta data to hibernate please perform ORM on this class
@Entity					// 2nd 
public class Food  implements Serializable{

	// 3rd will tell hibernate that is particular variable is taken for PK
	@Id // any data type
	
	// auto generate pk
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int foodId;
	
	private String foodFrom;
	
	private String name;
	
	private String famousFor;

	public int getFoodId() {
		return foodId;
	}

	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}

	public String getFoodFrom() {
		return foodFrom;
	}

	public void setFoodFrom(String foodFrom) {
		this.foodFrom = foodFrom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}

	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Food [foodId=" + foodId + ", foodFrom=" + foodFrom + ", name=" + name + ", famousFor=" + famousFor
				+ "]";
	}
	
	
	
	
	
}
