package com.kodnest.methodoverriding.rule4;

public class Parent 
{
	ElectronicDevice display()
	{
		System.out.println("Parent display");
		ElectronicDevice ed=new ElectronicDevice();
		return ed;
	}
}
