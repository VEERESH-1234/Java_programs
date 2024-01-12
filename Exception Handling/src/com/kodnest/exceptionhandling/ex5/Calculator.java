package com.kodnest.exceptionhandling.ex5;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		System.out.println("Calculation is started");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=scan.nextInt();
		System.out.println("Enter second number");
		int b=scan.nextInt();
		multiply(a,b);
		System.out.println("Calculation is ended");
	}
	public static void multiply(int a,int b)
	{
		System.out.println("Multiplication is started");
		int mulres=a*b;
		System.out.println("Multiplicatrion result is : "+mulres);
		divide(a,b);
		System.out.println("Multiplication is ended");
	}
	public static void divide(int a,int b)
	{
		//Handling an exception in the same method where exception is generated
		try
		{
			System.out.println("Division is started");
			int divres=a/b;
			System.out.println("Division result is : "+divres);
		}
		catch(Exception e)
		{
			System.out.println("Exception is handled in the divide method");
		}
		finally
		{
			System.out.println("Division is ended");
		}
	}

}
