package com.kodnest.methodoverriding.rule2;

public class Child1 extends Parent
{
	public void display()//No error,bcz visibility is increased
	{
		System.out.println("Child 1 display");
	}
}
