package com.testing.service;

import java.util.List;

import com.testing.Exception.NoDatFoundException;
import com.testing.entity.Contact;

public interface ContactService {

	
	public String getNameById(Integer id) ;
	
	
	public  Contact getContactById(Integer id) throws NoDatFoundException;
	public List<String>  getAllContatctNames();
}
