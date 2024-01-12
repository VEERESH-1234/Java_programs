package com.kodnest.abstraction.pureorimpureabstraction;
//Impure abstract class
abstract class Program2 
{
	//Concrete method
	void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	//Abstract method
	abstract void sub();
}
