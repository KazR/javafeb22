package com.qa.scope;

public class Runner 
{
	
	public static void main(String[] args) 
	{
		
		Scope myObj = new Scope();
		myObj.methodOne();
		String test = "poo";
		myObj.methodTwo();
		myObj.methodTwo(test);
		
		
	}

}
