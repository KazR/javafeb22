package com.qa.scope;

public class Print 
{
	@Override
	public String toString() 
	{
	    return "object";
	}
	
	public static void main(String[] args) 
	{
		Print person = new Print();
		System.out.println(person);
	}
}
