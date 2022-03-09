package com.qa.constructors;

public class Animal {
	
	public String breed;
	public int age;
	
	public Animal(String breed, int age)
	{	
		this.breed = breed;
		this.age = age;
	}
	
    public String toString()
    {
        return breed + " " + age;
    }

}
