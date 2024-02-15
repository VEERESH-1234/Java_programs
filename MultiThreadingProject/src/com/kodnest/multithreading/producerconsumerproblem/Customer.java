package com.kodnest.multithreading.producerconsumerproblem;

public class Customer implements Runnable
{
	PizzaHouse ph;
	Customer(PizzaHouse ph)
	{
		this.ph=ph;
	}
	public void run()
	{
		while(true)
		{
			ph.eat();
		}
	}
}
