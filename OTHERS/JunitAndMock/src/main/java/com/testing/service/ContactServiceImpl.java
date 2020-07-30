package com.testing.service;

import java.util.List;

import com.testing.Exception.NoDatFoundException;
import com.testing.dao.contactDao;
import com.testing.entity.Contact;

public class ContactServiceImpl implements ContactService {

	private contactDao contactDao;
	
	

	public contactDao getContactDao() {
		return contactDao;
	}

    public void setContactDao(contactDao contactDao) {
		this.contactDao = contactDao;
	}



	public String getNameById(Integer id) {
 
		String name = contactDao.findNameById(id);

		String formattedName = name.toUpperCase();

		return formattedName;
	}



	public List<String> getAllContatctNames() {
		List<String> listOfStrings= contactDao.findNames();
		if(!listOfStrings.isEmpty()) {
			return listOfStrings;
		}else {
			return null;
			
		}
		
	}

	public Contact getContactById(Integer id) throws NoDatFoundException  {
	 Contact contact = contactDao.findContact_ById(id);
	 if(contact==null) {
		throw new NoDatFoundException(); 
	 }else
		return contact;
	}

}
