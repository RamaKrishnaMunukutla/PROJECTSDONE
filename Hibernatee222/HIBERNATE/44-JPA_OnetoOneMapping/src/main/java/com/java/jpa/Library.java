package com.java.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "lib")
public class Library {
	
	public Library() {
		super();
	}

	@Id
	 
	private int b_id;
	private String b_name;

	public int getB_id() {
		return b_id;
	}

	public void setB_id(int b_id) {
		this.b_id = b_id;
	}

	public String getB_name() {
		return b_name;
	}

	public void setB_name(String b_name) {
		this.b_name = b_name;
	}

	@Override
	public String toString() {
		return "Library [b_id=" + b_id + ", b_name=" + b_name + "]";
	}

}
