package com.kodnest.interface8;

public class MyCalculator implements Calculator2
{
	public void add()
	{
		System.out.println("Addition result of 10 and 20 is: "+(10+20));
	}
	public void sub()
	{
		System.out.println("Substraction result of 30 and 15 is :"+(30-15));
	}
	public void multiply()
	{
		System.out.println("Multiplication result of 10 and 2 is : "+(10*2));
	}
	public void divide()
	{
		System.out.println("Division result of 10 and 5 is : "+(10/5));
	}
}
