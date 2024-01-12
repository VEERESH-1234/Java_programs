package com.kodnest.exceptionhandling.rule2;

public class Child extends Parent
{
	@Override
	void display() throws ArithmeticException
	{
		System.out.println("Child class display method");
	}
}
