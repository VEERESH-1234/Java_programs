package com.kodnest.aggregation;

public class Pilot {
	String name;
	Pilot(String name)
	{
		this.name=name;
	}
	void fly()
	{
		System.out.println(name+" is flying");
	}
}
