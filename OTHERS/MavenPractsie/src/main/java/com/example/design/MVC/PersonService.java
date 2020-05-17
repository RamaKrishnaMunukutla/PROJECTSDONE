package com.example.design.MVC;

import java.util.List;

public interface PersonService {
	
	Person createPerson(Person person);
    List<Person> getAllPersons();

}
