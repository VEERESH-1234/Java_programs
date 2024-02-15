package com.kodnest.inheritance.methodex;

public class Circle extends Shape
{
	void draw()
	{
		System.out.println("Drawing a Circle");
	}
	double findArea()
	{
		double radius=5.5;
		return Math.PI*radius*radius;
	}
}
