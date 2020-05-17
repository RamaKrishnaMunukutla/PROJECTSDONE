package com.javainuse.service;

import org.springframework.stereotype.Service;

import com.javainuse.model.Employee;

@Service
public class EmployeeService {

	public Employee getEmployee() throws EmployeeServiceException {
		Employee emp = null;
		return emp;
	}

	public Employee getEmployeeNull() throws EmployeeServiceException {

		return null;
	}

	public Employee getEmployeeException() throws EmployeeServiceException {

		throw new EmployeeServiceException();
	}

}
