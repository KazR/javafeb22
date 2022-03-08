package com.qa.helloworld;


public class HelloWorld 
{
	
	public static void helloWorld()
	{
		String helloWorld = new String("Hello World");
		System.out.println(helloWorld);
	}
	
	public static String concatText(String x, String y)
	{
		return x + " " + y;
	}
	
	public void printMessage(String messageA, String messageB, int number)
	{
		System.out.println(messageA);
		System.out.println(messageB);
		System.out.println(number);
	}

}
