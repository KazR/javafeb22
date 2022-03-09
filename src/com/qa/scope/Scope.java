package com.qa.scope;

public class Scope 
{
	public String message = "Hello";
	
	public void methodOne()
	{
		String message = "Goodbye";
		System.out.println(message);
	}
	
	public void methodTwo()
	{
		System.out.println("test");
	}
	
	public void methodTwo(String message)
	{
		System.out.println(message);
	}

}
