package com.kodnest.multithreading.producerconsumerproblem;

public class Baker implements Runnable
{
	PizzaHouse ph;
	int num=0;
	Baker(PizzaHouse ph)
	{
		this.ph=ph;
	}
	public void run()
	{
		while(true)
		{
			ph.bake(num++);
		}
	}
}
