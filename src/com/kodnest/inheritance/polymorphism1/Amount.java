package com.kodnest.inheritance.polymorphism1;

public class Amount 
{
	void doActivity(Payment pa)
	{
		pa.bill();
		pa.offer();
		pa.pay();
	}
}
