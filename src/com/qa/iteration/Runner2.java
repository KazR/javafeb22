package com.qa.iteration;
import java.util.ArrayList;
import java.util.Collections;

public class Runner2 
{

	public static void main(String[] args) 
	{

		double cst = 251;
		double mon = 300;
		double change = mon - cst;
		double[] coins = {50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};
		ArrayList<Double> finalCoin = new ArrayList<>();
		int i = 0;
		while (change > 0)
		{
			while(change > coins[i])
			{
				if(change < coins[i])
				{
					i = i+1;
				}
				System.out.println(coins[i]);
				change = change-coins[i];
				if (change == 0)
				{
					System.out.println("done");
					break;
				}
			}
		}

	}		
}
