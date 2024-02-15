package com.kodnest.methodoverriding.rule5;

public class Child extends Parent
{
	ElectronicDevice display()//Error
	{
		System.out.println("Parent display");
		ElectronicDevice ed=new ElectronicDevice();
		return ed;
	}
}
