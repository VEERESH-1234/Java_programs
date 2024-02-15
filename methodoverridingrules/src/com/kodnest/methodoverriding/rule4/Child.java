package com.kodnest.methodoverriding.rule4;

public class Child extends Parent
{
	Laptop display()
	{
		System.out.println("Child display");
		Laptop lp=new Laptop();
		return lp;
	}
}
