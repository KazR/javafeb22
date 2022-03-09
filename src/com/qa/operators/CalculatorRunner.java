package com.qa.operators;
import java.util.Scanner;

public class CalculatorRunner {

	public static void main(String[] args) 
	{
		Scanner inp = new Scanner(System.in);
		Calculator cal = new Calculator();
		
		System.out.println("Input number 1");
		double a = inp.nextDouble();
		System.out.println("Input number 2");
		double b = inp.nextDouble();
		inp.close();
		
		System.out.println("Added: " + cal.addition(a, b));
		System.out.println("Subtracted: " + cal.subtraction(a, b));
		System.out.println("Multiplied: " + cal.multiply(a, b));
		System.out.println("Devided: " + cal.division(a, b));
	}
}
