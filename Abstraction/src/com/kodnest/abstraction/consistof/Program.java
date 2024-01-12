package com.kodnest.abstraction.consistof;

abstract class Program 
{
	static int x,y;//static variables
	int p,q;//non-static variables or instance variables
	//static block
	static
	{
		System.out.println("Inside static block");
	}
	//non-static block or instance block
	{
		System.out.println("Inside non-static block");
	}
	//static method
	static void display1()
	{
		System.out.println("Inside static method display1");
	}
	//non static method or instance method
	void display2()
	{
		System.out.println("Inside non static method display2");
	}
	//abstract method
	abstract void display3();
	//constructor
	public Program()
	{
		System.out.println("Inside Program Constructor");
	}
	public static void main(String[] args) 
	{
		System.out.println("Inside main method");
	}
}
