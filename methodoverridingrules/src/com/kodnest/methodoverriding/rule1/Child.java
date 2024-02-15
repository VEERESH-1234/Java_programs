package com.kodnest.methodoverriding.rule1;

class Child extends Parent
{
	public void display()//No error,bcz same access modifier
	{
		System.out.println("Child display");
	}
}
