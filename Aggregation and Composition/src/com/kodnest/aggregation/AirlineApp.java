package com.kodnest.aggregation;

public class AirlineApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pilot p=new Pilot("Raju");
		p.fly();
		Airline ar=new Airline("FastAir",p);
		ar.operations();
	}

}
