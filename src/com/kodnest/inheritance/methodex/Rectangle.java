package com.kodnest.inheritance.methodex;

public class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing a Rectangle");
	}
	double findArea()
	{
		double l=5.0,b=6.0;
		return l*b;
	}
}
