package com.kodnest.multithreading.prodcons1;

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
