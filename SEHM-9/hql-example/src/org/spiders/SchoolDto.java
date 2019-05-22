package org.spiders;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "table_school")
public class SchoolDto implements Serializable {

	@Id
	@GenericGenerator(name = "asd", strategy = "increment")
	@GeneratedValue(generator = "asd")
	private int id;

	@Column(name = "school_name")
	private String schoolName;
	
	@Column(name = "school_area")
	private String area;

	public SchoolDto(String schoolName, String area, String board) {
		super();
		this.schoolName = schoolName;
		this.area = area;
		this.board = board;
	}

	@Column(name = "school_board")
	private String board;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getBoard() {
		return board;
	}

	public void setBoard(String board) {
		this.board = board;
	}

	public SchoolDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SchoolDto [id=" + id + ", schoolName=" + schoolName + ", area=" + area + ", board=" + board + "]";
	}

	
}
