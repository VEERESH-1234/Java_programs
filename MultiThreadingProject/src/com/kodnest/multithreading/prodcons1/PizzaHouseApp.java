package com.kodnest.multithreading.prodcons1;

public class PizzaHouseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaHouse ph=new PizzaHouse();

		Baker bk=new Baker(ph);
		Customer ct=new Customer(ph);

		Thread t1=new Thread(bk);
		Thread t2=new Thread(ct);

		t1.start();
		t2.start();

	}

}
