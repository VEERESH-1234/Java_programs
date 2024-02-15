package com.kodnest.multithreading.synchronizedkeyword;

public class Hospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Treatment tr=new Treatment();
		
		Thread t1=new Thread(tr);
		Thread t2=new Thread(tr);
		
		t1.setName("Tom");
		t2.setName("Jerry");

		t1.start();
		t2.start();
	}

}
