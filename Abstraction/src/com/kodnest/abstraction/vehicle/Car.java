package com.kodnest.abstraction.vehicle;

abstract class Car 
{
	void start()
	{
		System.out.println("Car is started");
	}
	void stop()
	{
		System.out.println("Car is stopped");
	}
	abstract void refuel();
}
