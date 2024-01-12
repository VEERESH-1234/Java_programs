package com.kodnest.exceptionhandling.rule7;

public class Child extends Parent
{
	@Override
	void display() throws ArrayIndexOutOfBoundsException
	{
		System.out.println("Child class display method");
	}
}
