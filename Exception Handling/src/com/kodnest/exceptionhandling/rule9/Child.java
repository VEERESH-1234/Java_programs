package com.kodnest.exceptionhandling.rule9;

public class Child extends Parent
{
	@Override
	void display() throws Exception//Error
	{
		System.out.println("Child class display method");
	}
}
