package com.kodnest.methodoverriding.rule3;

public class Child2 extends Parent
{
	double display()//Error,bcz different return type as parent class method
	{
		System.out.println("Child 2 display");
		return 30;
	}
}
