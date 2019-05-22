import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Student implements Serializable {

	@Id
	private int rollNo;
	
	private String name;
	
	private String email;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
