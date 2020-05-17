package com.example.design.ProtoType;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable{

	private List<String> empList;
	
	 //Default-Constructor
	public Employees(){
		empList = new ArrayList<String>();
	}
	
	//Parametric-Constructor
	public Employees(List<String> list){
		this.empList=list;
	}
	
	//(Instance-Method) Read all employees from database and put into the list
	public void loadData(){
		empList.add("Pankaj");
		empList.add("Raj");
		empList.add("David");
		empList.add("Lisa");
	}
	
	public List<String> getEmpList() {
		return empList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
			List<String> temp = new ArrayList<String>();
			for(String s : this.getEmpList()){
				temp.add(s); //Adding elements to another List
			}
			return new Employees(temp);
	}
	
}
