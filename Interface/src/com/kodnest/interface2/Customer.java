package com.kodnest.interface2;

public class Customer implements Food,Shake
{
	public void eat()
	{
		System.out.println("Customer is eating biryani");
	}
	
	public void drink()
	{
		System.out.println("Customer is drinking oreo milk shake");
	}
}
