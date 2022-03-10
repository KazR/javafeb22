package com.qa.operators;

public class Results 
{
	public int physics;
	public int chemistry;
	public int biology;
	public int total = physics + chemistry + biology;
	public double percentage = (total*100) / 450;
	
	public Results(int  physics, int chemistry, int biology)
	{	
		this.physics = physics;
		this.chemistry = chemistry;
		this.biology = biology;
		this.total = physics + chemistry + biology;
		this.percentage = (total*100) / 450;
	}
	


}
