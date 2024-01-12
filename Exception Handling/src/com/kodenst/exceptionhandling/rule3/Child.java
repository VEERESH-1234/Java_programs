package com.kodenst.exceptionhandling.rule3;

public class Child extends Parent
{
	@Override
	void display() throws ArithmeticException
	{
		System.out.println("Child class display method");
	}
}
