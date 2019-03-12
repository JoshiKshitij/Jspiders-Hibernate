package org.spiders;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "table_tree")
public class Tree implements Serializable{

	@Id
	@GeneratedValue
	private long id;
	
	@Column(name = "tree_name" , nullable = false , unique = true)
	private String treeName;

	private int age;
	
	//@Embedded
	@ElementCollection
	private List<Fruits> fruits;
	
	
	@Override
	public String toString() {
		return "Tree [id=" + id + ", treeName=" + treeName + ", age=" + age + "]";
	}

	public Tree() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTreeName() {
		return treeName;
	}

	public void setTreeName(String treeName) {
		this.treeName = treeName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Fruits> getFruits() {
		return fruits;
	}

	public void setFruits(List<Fruits> fruits) {
		this.fruits = fruits;
	}

}
