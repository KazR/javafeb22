package com.qa.operators;

public class ResultsRunner {
	
	public static void printResult(int a, int b, int c, int d)
	{
		System.out.println("Physics:		 " + a);
		System.out.println("Chemistry:		 " + b);
		System.out.println("Biology:		 " + c);
		System.out.println("Total:			 " + d);
	}
	
	public static void main(String[] args) 
	{
		
		Results test = new Results(10, 20, 50);
		printResult(test.physics, test.chemistry, test.biology, test.total);
		if (test.percentage > 60)
		{
			System.out.println("Passing grade!!");
			System.out.println("Percentage: 		 " + test.percentage + "%");
		}
		else
		{
			System.out.println("Failing grade!!");
			System.out.println("Percentage: 		 " + test.percentage + "%");	
		}
		

		

	}

}
