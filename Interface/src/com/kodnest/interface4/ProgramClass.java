package com.kodnest.interface4;

public class ProgramClass implements ProgramInterface 
{

	@Override
	public void display() {
		// mandatory to use public as visibility cannot be reduced
		System.out.println("Inside display");
		
	}
	
}
