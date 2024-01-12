package com.kodnest.abstraction.pureorimpureabstraction;
//Impure abstract class
abstract class Program3 
{
	//Concrete method
	void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	//Concrete method
	void sub()
	{
		int a=20;
		int b=10;
		int c=a-b;
		System.out.println(c);
	}
}
