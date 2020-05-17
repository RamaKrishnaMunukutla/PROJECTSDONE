package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	public List<com.example.demo.model.EmployeeVO> getAllEmployees() {
		System.out.println("================eNTERED===============");
		List<com.example.demo.model.EmployeeVO> employees = new ArrayList<com.example.demo.model.EmployeeVO>();

		com.example.demo.model.EmployeeVO vo1 = new com.example.demo.model.EmployeeVO();
		vo1.setId(1);
		vo1.setFirstName("Lokesh");
		vo1.setLastName("Gupta");
		employees.add(vo1);

		com.example.demo.model.EmployeeVO vo2 = new com.example.demo.model.EmployeeVO();
		vo2.setId(2);
		vo2.setFirstName("Raj");
		vo2.setLastName("Kishore");
		employees.add(vo2);

		return employees;
	}
}