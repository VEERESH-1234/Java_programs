package com.kodnest.exceptionhandling.rule5;

public class Child extends Parent
{
	@Override
	void display() throws ArithmeticException
	{
		System.out.println("Child class display method");
	}
}
