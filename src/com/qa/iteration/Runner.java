package com.qa.iteration;
import java.util.ArrayList;
import java.util.Collections;

public class Runner {

	public static void main(String[] args) {
//		
//		for (int i = 0; i < 10; i++)
//		{
//			System.out.println("test " + i);
//		}
		
		double cst = 97.35;
		double mon = 300;
		double change = mon - cst;
		double count = 0;
		ArrayList<Double> list = new ArrayList<>();
		
		while(change > 0.0)
		{
			
			if(change > 50)
			{
				System.out.println("£50");
				change -= 50;
				count += 50;
				double coin50 = 50;
				list.add(coin50);
			}
			else if(change >= 20)
			{
				System.out.println("£20");
				change -= 25;
				count += 25;
				double coin25 = 25;
				list.add(coin25);
			}
			else if (change >=10)
			{
				System.out.println("£10");
				change -= 10;
				count += 10;
				double coin10 = 10;
				list.add(coin10);
			}
			else if (change >= 5)
			{
				System.out.println("£5");
				change -= 5;
				count += 5;
				double coin5 = 5;
				list.add(coin5);
			}
			else if (change >= 2)
			{
				System.out.println("£2");
				change -= 2;
				count += 2;
				double coin2 = 2;
				list.add(coin2);
			}
			else if (change >= 1)
			{
				System.out.println("£1");
				change -= 1;
				count += 1;
				double coin1 = 1;
				list.add(coin1);
			}
			else if (change >= 0.50)
			{
				System.out.println("50p");
				change -= 0.50;
				count += 0.5;
				double coin05 = 0.5;
				list.add(coin05);
			}
			else if (change >= 0.20)
			{
				System.out.println("20p");
				change -= 0.20;
				count += 0.20;
				double coin02 = 0.2;
				list.add(coin02);
			}
			else if (change >= 0.10)
			{
				System.out.println("10p");
				change -= 0.10;
				double coin01 = 0.1;
				list.add(coin01);
			}
			else if (change >= 0.05)
			{
				System.out.println("5p");
				change -= 0.05;
				count += 0.05;
				double coin005 = 0.05;
				list.add(coin005);
			}
			else if (change >= 0.02)
			{
				System.out.println("2p");
				change -= 0.02;
				count += 0.02;
				double coin002 = 0.02;
				list.add(coin002);
			}
			else if (change >= 0.01)
			{
				System.out.println("1p");
				change -= 0.01;
				count += 0.01;
				double coin001 = 0.01;
				list.add(coin001);
			}
			else
			{
				System.out.println("change is £" + count);
				Collections.sort(list);
				System.out.println(list);
				break;
			}
		}
		


	}

}
