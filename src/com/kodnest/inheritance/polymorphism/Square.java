package com.kodnest.inheritance.polymorphism;

public class Square extends Shape
{
	void draw()
	{
		System.out.println("Drawing a Square");
	}
	double findArea()
	{
		double side=5.5;
		return side*side;
	}
}
