package com.kodnest.aggregation1;

public class AirlineApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pilot p=new Pilot("Raju");
		p.fly();
		Airline ar=new Airline("FastAir",p);
		ar.operations();
		System.out.println("Destroying Airline object");
		ar=null;
		ar.operations();
		p.fly();

	}

}
