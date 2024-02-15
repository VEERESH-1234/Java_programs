package com.kodnest.inheritance.constructor2;

public class Tiger extends Animal
{
	String tigerSound="Tiger Roar";
	void makeSound()
	{
		System.out.println("Tiger is making "+tigerSound);
	}
	void accessParentMethod()
	{
		super.makeSound();
	}
}
