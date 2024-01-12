package com.kodnest.exceptionhandling.rethrowex6;

import java.util.Scanner;

public class ShoppingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shop();

	}
	public static void shop()
	{
		try
		{
			pay();
			System.out.println("Shopping is completed");
		}
		catch(Exception e)
		{
			System.out.println("Exception is handled in shop method");
			System.out.println("Shopping is not completed, due to payment failure");
		}
	}
	public static void pay() throws Exception//giving warning to the caller method
	{
		try
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the amount to be paid");
			int amt=scan.nextInt();
			System.out.println("Total amount paid is "+amt);
		}
		catch(Exception e)
		{
			System.out.println("Exception is handled in pay method");
			throw e;//throwing the exception to the caller method ie,shop()
		}
	}

}
