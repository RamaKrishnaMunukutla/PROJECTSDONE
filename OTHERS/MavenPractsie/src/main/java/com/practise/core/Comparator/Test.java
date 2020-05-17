package com.practise.core.Comparator;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class Test {
	
	
	 public static void main(String[] args) throws CloneNotSupportedException 
	    {
	        ArrayList<Employee> employees = new ArrayList<>();
	         
	        employees.add(new Employee(101,"amar","AMC"));
	        employees.add(new Employee(103,"bhopal","ZIM"));
	        employees.add(new Employee(102,"zara","IND"));
	        employees.add(new Employee(104,"kiran","UK"));
	        
	     
	       employees.sort(new IdSort().reversed());
	       for(Employee emp:employees) {
	        	  System.out.println(emp);
	          }
	       System.out.println("=================Names========================");
	       employees.sort(new ENameSort());
	       for(Employee emp:employees) {
	        	  System.out.println(emp);
	          }
	       System.out.println("===================Loc======================");
	       employees.sort(new ElocSort().reversed());
	       
	       

          for(Employee emp:employees) {
        	  System.out.println(emp);
          }
	        
	        
	    }

}
