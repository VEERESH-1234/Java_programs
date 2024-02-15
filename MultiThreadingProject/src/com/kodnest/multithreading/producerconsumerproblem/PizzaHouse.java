package com.kodnest.multithreading.producerconsumerproblem;

public class PizzaHouse 
{
	int token;
	public void bake(int num)
	{
		token=num;
		System.out.println("Baked pizza for token- "+token);
	}
	public void eat()
	{
		System.out.println("Eating pizza for token- "+token);
	}
}
