package com.kodnest.abstraction.vehicle;

public class Vehicle 
{
	void doActivity(Car cr)
	{
		cr.start();
		cr.stop();
		cr.refuel();
	}
}
