package com.example.demo.controller;

 
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.EmployeeDAOImpl;

@RestController
@RequestMapping("/ctr")
public class EmployeeController 
{
	@Autowired
	EmployeeDAOImpl manager;

	@RequestMapping(value = "/getall", method = RequestMethod.GET)
	public String getAllEmployees(Model model)
	{
		System.out.println("=============HAIIIIIIIIIII==================");
		List<com.example.demo.model.EmployeeVO>  asd= manager.getAllEmployees();
		System.out.println(asd);
		model.addAttribute("employees", asd);
		return "employeesListDisplay";
	}
	
	@RequestMapping("/hello")
	public String hello() {
		return "Haii";
	}
	
	
	
	
	
} 


// ctr/getall