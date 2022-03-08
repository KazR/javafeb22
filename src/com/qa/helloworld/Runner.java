package com.qa.helloworld;

public class Runner {
	
	public static void main(String[] args) {
		HelloWorld myObj = new HelloWorld();
		
		myObj.helloWorld();
		myObj.printMessage("Hello World", "More text", 21);
		
		String myResult = myObj.concatText("Hello", "World");
		System.out.println(myResult);
		
	}

}
