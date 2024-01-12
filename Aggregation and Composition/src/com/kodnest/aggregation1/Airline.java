package com.kodnest.aggregation1;

public class Airline {
	String brand;
	Pilot p;
	Airline(String brand,Pilot p)
	{
		this.brand=brand;
		this.p=p;
	}
	void operations()
	{
		System.out.println(brand+" is doing opeartions");
		p.fly();
	}
}
