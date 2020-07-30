package com.testing.contact;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.easymock.EasyMock;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.testing.Exception.NoDatFoundException;
import com.testing.dao.contactDao;
import com.testing.entity.Contact;
import com.testing.service.ContactServiceImpl;

public class ContatctServiceTest {

	private static ContactServiceImpl contactServiceImpl = null;

	@BeforeClass
	public static void init() {

		contactDao daoProxy = EasyMock.createMock(contactDao.class);

		// Set Behavior for //Method-1
		EasyMock.expect(daoProxy.findNameById(101)).andReturn("Rama");
		EasyMock.expect(daoProxy.findNameById(102)).andReturn("Krishna");
	 
		
		List<String> listOfString = new ArrayList<String>();
		listOfString.add("Rama");
		listOfString.add("Kishna");

		// Set Behavior for Method-2
		EasyMock.expect(daoProxy.findNames()).andReturn(listOfString);
		
		Contact contact = new Contact();
		contact.setContactname("RamKi");
		contact.setContactNumber(8247336998L);
		contact.setContatctid(121);
		
		// Set Behavior for Method-3
		EasyMock.expect(daoProxy.findContact_ById(101)).andReturn(contact);
		
		//Activating-Proxy
		EasyMock.replay(daoProxy);

		// Creating Object && Injecting
		contactServiceImpl = new ContactServiceImpl();
		contactServiceImpl.setContactDao(daoProxy);

	}

	@Test
	@Ignore
	public void testGetNameById() { //Method-1
		String name = contactServiceImpl.getNameById(101);
		assertNotNull(name);

	}

	@Test
	@Ignore
	public void testGetNames() {//Method-2

		List<String> contactNames = contactServiceImpl.getAllContatctNames();
		assertNotNull(contactNames);

	}
	
	
	@Test
	public void testGetNameBy_ContactId() throws NoDatFoundException {//Method-2

		Contact contact = contactServiceImpl.getContactById(101);
		assertNotNull(contact);

	}

}
