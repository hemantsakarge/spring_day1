package com.cjc.karve;

public class Voting {
	
	int age;
	public Voting(int age)
	{
		if(age>18)
		{
			System.out.println("you can vote");
		}
		else
		{
			throw new InvaldiageException();
		}
	}
	
	public void m1()
	{
		System.out.println("m1 method called");
	}

}
