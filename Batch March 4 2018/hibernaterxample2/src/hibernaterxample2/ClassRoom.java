package hibernaterxample2;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// @Entity tells hibernate that this 
//call is the class which has to saved in db
@Entity	
@Table(name = "xyzz")// 1st rule
public class ClassRoom implements Serializable {
	
	
	//2nd rule
	@Id // to tell this is the primary key in my class
	@GeneratedValue
	private int id;
	
	@Column( name = "no_of_students")
	private  int noOfStudent;
	
	private String roomName;
	
	private int floorNo;

	public int getId() {
		return id;
	}

	// 3rd rule
	public void setId(int id) {
		this.id = id;
	}

	public int getNoOfStudent() {
		return noOfStudent;
	}

	public void setNoOfStudent(int noOfStudent) {
		this.noOfStudent = noOfStudent;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public int getFloorNo() {
		return floorNo;
	}

	public void setFloorNo(int floorNo) {
		this.floorNo = floorNo;
	}

	
	//4th rule
	public ClassRoom() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClassRoom(int id, int noOfStudent, String roomName, int floorNo) {
		super();
		this.id = id;
		this.noOfStudent = noOfStudent;
		this.roomName = roomName;
		this.floorNo = floorNo;
	}

	@Override
	public String toString() {
		return "ClassRoom [id=" + id + ", noOfStudent=" + noOfStudent + ", roomName=" + roomName + ", floorNo="
				+ floorNo + "]";
	}
	
	
}
