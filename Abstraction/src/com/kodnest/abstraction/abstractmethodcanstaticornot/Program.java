package com.kodnest.abstraction.abstractmethodcanstaticornot;

abstract public class Program 
{
	 abstract static void display1();//Error,bcz abstract method cannot be declared as static method
	 
	 static void display2()//No Error,bcz concrete method can be declared as static method
	 {
		 int a=10;
		 int b=20;
		 int c=a+b;
		 System.out.println(c);
	 }
	
}
