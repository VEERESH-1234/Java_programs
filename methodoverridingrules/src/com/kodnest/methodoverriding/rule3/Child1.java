package com.kodnest.methodoverriding.rule3;

public class Child1 extends Parent
{
	int display()//No error,bcz same return type as parent class method
	{
		System.out.println("Child 1 display");
		return 20;
	}
}
