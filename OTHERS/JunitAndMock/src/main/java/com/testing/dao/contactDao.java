package com.testing.dao;

import java.util.List;

import com.testing.entity.Contact;

public interface contactDao {
	
	public String findNameById(Integer id) ; //Method-1
	
	
	public List<String> findNames(); //Method-2
	
	public Contact findContact_ById(Integer id); //Method-3
		
	

}
