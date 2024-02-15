package com.kodnest.methodoverriding.rule1;

class Child2 extends Parent
{
	void display()//Error,bcz different access modifier
	{
		System.out.println("Child 2 display");
	}
}
