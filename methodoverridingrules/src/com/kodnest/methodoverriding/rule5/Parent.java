package com.kodnest.methodoverriding.rule5;

public class Parent 
{
	Laptop display()
	{
		System.out.println("Child display");
		Laptop lp=new Laptop();
		return lp;
	}
}
