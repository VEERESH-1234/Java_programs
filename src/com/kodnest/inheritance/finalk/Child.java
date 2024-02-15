package com.kodnest.inheritance.finalk;

public class Child extends Parent
{
	int y=20;
	void change()
	{
		x=99;
		y=88;
	}
	void display()
	{
		System.out.println("Updated value of x : "+x);
		System.out.println("Updated value of y : "+y);
	}
}
