package com.kodnest.exceptionhandling.ex1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		System.out.println("Calculation is started");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=scan.nextInt();
		System.out.println("Enter second number");
		int b=scan.nextInt();
		int c=a/b;
		System.out.println("Division result is : "+c);
		}
		catch(Exception e)
		{
			System.out.println("Exception is handled");
		}
		System.out.println("calculation is ended");
	}

}
