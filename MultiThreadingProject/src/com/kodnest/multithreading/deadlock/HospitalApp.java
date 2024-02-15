package com.kodnest.multithreading.deadlock;

public class HospitalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hospital h=new Hospital();

		Tom tom=new Tom(h);
		Jerry jerry=new Jerry(h);

		Thread t1=new Thread(tom);
		Thread t2=new Thread(jerry);

		t1.start();
		t2.start();

	}

}
