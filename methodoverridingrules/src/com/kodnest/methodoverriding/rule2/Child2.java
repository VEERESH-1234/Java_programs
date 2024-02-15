package com.kodnest.methodoverriding.rule2;

public class Child2 extends Parent
{
	void display()//Error,bcz visibility is reduced
	{
		System.out.println("Child 2 display");
	}
}
