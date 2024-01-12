package com.kodnest.abstraction.vehicle;

public class CarApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricCar ec=new ElectricCar();
		PetrolCar pc=new PetrolCar();
		DieselCar dc=new DieselCar();
		Vehicle v=new Vehicle();
		v.doActivity(ec);
		v.doActivity(pc);
		v.doActivity(dc);

	}

}
