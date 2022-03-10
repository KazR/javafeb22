package com.qa.blackjack;

public class Runner {
	
	public static int jacks(int a, int b)
	{
		int g = 21;
		if (a > 0 && b > 0)
		{
			if (a > 21 && b > 21)
			{
				return 0;
			}
			else if ((a-g) > (b-g))
			{
				if(a > g)
				{
					return a;
				}
				else
				{
					return b;
				}
			}
			else if ((a-g) < (b-g))
			{
				if(b > g)
				{
					return a;
				}
				else
				{
					return b;
				}
			}
		}
		return 0;
	}

	public static void main(String[] args) 
	{
		System.out.println(jacks(22, 23));
		
	}
	
}
