package com.kodnest.exceptionhandling.ex3;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println("Program execution is started");
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter numerator");
			int a=scan.nextInt();
			System.out.println("Enter denominator");
			int b=scan.nextInt();
			int c=a/b;
			System.out.println("Division result is : "+c);
			System.out.println("Enter the size of array");
			int size=scan.nextInt();
			int[]arr=new int[size];
			System.out.println("Enter the element to be stored in the array");
			int element=scan.nextInt();
			System.out.println("Enter the index at which the element has to be stored");
			int index=scan.nextInt();
			arr[index]=element;
			System.out.println("Element is stored in the array");
		}
		catch(Exception e)
		{
			System.out.println("Exception is handled");
			e.printStackTrace();
		}
		finally 
		{
			System.out.println("Program execution is ended");
		}
	}

}
