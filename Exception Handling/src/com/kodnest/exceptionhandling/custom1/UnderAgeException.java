package com.kodnest.exceptionhandling.custom1;

public class UnderAgeException extends Exception
{
	public UnderAgeException()
	{
		super("You are too young have a patience");
	}
}
