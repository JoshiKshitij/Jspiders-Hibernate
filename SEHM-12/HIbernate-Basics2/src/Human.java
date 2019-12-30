import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Human implements Serializable {

	@Id
	@GeneratedValue
	(strategy= GenerationType.IDENTITY)
	private int id;
	private String name;

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

	public Human() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Human [id=" + id + ", name=" + name + "]";
	}
	

}

