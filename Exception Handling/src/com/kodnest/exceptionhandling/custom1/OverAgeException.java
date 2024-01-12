package com.kodnest.exceptionhandling.custom1;

public class OverAgeException extends Exception
{
	public OverAgeException()
	{
		super("You are too old, take rest");
	}
}
