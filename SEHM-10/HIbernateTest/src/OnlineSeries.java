import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class OnlineSeries 
implements Serializable{

	//pk
	@Id
	private int id;
	
	private String name;
	
	private int noOfSeasons;
	
	private String mainChar;
	
	private String villan;

	@Override
	public String toString() {
		return "OnlineSeries [id=" + id + ", name=" + name + ", noOfSeasons=" + noOfSeasons + ", mainChar=" + mainChar
				+ ", villan=" + villan + "]";
	}

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

	public int getNoOfSeasons() {
		return noOfSeasons;
	}

	public void setNoOfSeasons(int noOfSeasons) {
		this.noOfSeasons = noOfSeasons;
	}

	public String getMainChar() {
		return mainChar;
	}

	public void setMainChar(String mainChar) {
		this.mainChar = mainChar;
	}

	public String getVillan() {
		return villan;
	}

	public void setVillan(String villan) {
		this.villan = villan;
	}

	public OnlineSeries() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
