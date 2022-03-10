package com.qa.arrays;
import java.util.Random;

public class Excercise {

	public void popArr(int[] a)
	{
		for (int i = 0; i < a.length; i++)
		{
			Random rand = new Random();
			int randInt = rand.nextInt();
			a[i] = randInt;
			System.out.println(a[i]);
		}
	}
	
	public void multi(int[] a)
	{
		for (int i = 0; i < a.length; i++)
		{
			a[i] = a[i] * 10;
			System.out.println(a[i]);
		}
	}
}
