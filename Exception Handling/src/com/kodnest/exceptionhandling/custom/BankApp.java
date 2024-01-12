package com.kodnest.exceptionhandling.custom;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		try
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the amount to be withdrawn");
			int amt=scan.nextInt();
			withdraw(amt);
		}
		catch(InsufficientBalanceException ibe)
		{
			System.out.println("Custom Exception is handled");
			ibe.printStackTrace();
		}

	}
	public static void withdraw(int amt) throws InsufficientBalanceException
	{
		int balance=5000;
		if(amt<=balance)
		{
			System.out.println("Amount is withdrawn");
		}
		else
		{
			throw new InsufficientBalanceException();
		}
	}

}
