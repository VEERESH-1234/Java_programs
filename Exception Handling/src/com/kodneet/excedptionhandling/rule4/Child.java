package com.kodneet.excedptionhandling.rule4;

public class Child extends Parent
{
	@Override
	void display() throws IOException//Error
	{
		System.out.println("Child class display method");
	}
}
