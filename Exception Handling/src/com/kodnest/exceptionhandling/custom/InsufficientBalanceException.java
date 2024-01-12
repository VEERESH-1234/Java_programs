package com.kodnest.exceptionhandling.custom;

public class InsufficientBalanceException extends Exception
{
	public InsufficientBalanceException()
	{
		super("Enter the amount lesser than balance");
	}
}
