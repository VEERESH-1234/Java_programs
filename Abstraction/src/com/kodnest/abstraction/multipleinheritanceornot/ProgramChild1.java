package com.kodnest.abstraction.multipleinheritanceornot;

class ProgramChild1 extends Program1,Program2//Error
{
	@Override
	void add() 
	{
		System.out.println("Addition");

	}
}
