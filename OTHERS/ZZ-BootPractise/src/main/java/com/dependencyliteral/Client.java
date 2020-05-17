package com.java.resource;

public class Client {

	public static void main(String[] args) {
		
		Student s= new Student();
		MathCheat mm= new MathCheat();
		s.setMathcheat(mm);
		s.cheating();
		
	}
	
	
}
