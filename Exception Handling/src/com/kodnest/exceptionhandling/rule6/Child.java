package com.kodnest.exceptionhandling.rule6;

public class Child extends Parent
{
	@Override
	void display() throws IOException//Error
	{
		System.out.println("Child class display method");
	}
}
