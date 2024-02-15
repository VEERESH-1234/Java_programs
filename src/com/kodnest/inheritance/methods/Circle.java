package com.kodnest.inheritance.methods;

public class Circle extends Shape
{
	double radius=5.5;
	double calculateArea()
	{
		return Math.PI*radius*radius;
	}
	double calculatePerimeter()
	{
		return 2*Math.PI*radius;
	}
}
