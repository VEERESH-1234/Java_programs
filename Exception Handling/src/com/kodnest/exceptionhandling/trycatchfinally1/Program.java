package com.kodnest.exceptionhandling.trycatchfinally1;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println("calculation is started");
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter first number");
			int a=scan.nextInt();
			System.out.println("Enter second number");
			int b=scan.nextInt();
			add(a,b);
			sub(a,b);
			mul(a,b);
			divide(a,b);
		}
		catch(Exception e)
		{
			System.out.println("Exception is handled in the main method");
		}
		finally
		{
			System.out.println("Calculation is ended");
		}
	}
	public static void add(int a,int b)
	{
		System.out.println("Addition is started");
		int addres=a+b;
		System.out.println("Addition result is "+addres);
		System.out.println("Addition is ended");
	}
	public static void sub(int a,int b)
	{
		try
		{
			System.out.println("Substraction is started");
			int subres=a-b;
			System.out.println("Substraction result is "+subres);
		}
		catch(Exception e)
		{
			System.out.println("Exception is handled in sub catch block");
		}
		finally
		{
			System.out.println("Substraction is ended");
		}
	}
	public static void mul(int a,int b) throws Exception
	{
		System.out.println("Multiplication is started");
		int mulres=a*b;
		System.out.println("Multiplication result is "+mulres);
		System.out.println("Multiplication is ended");
	}
	public static void divide(int a,int b) throws Exception
	{
		try
		{
			System.out.println("Division is started");
			int divres=a/b;
			System.out.println("Division result is "+divres);
		}
		catch(Exception e)
		{
			System.out.println("Exception is handled in divide catch block");
			throw e;
		}
		finally
		{
			System.out.println("Division is ended");
		}
		
	}

}
