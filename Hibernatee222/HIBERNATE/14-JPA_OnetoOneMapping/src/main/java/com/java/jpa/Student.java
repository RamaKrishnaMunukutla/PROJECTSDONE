package com.java.jpa;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "stu")
public class Student {

	@Id  
     
    private int s_id;  
    private String s_name;  
      
    @OneToMany(targetEntity=Library.class)  
    private List books_issued;  

	public Student() {
		super();
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public List getBooks_issued() {
		return books_issued;
	}

	public void setBooks_issued(List books_issued) {
		this.books_issued = books_issued;
	}

	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", s_name=" + s_name + ", books_issued=" + books_issued + "]";
	}

	 

}
