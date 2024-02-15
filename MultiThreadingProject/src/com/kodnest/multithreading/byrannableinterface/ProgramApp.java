package com.kodnest.multithreading.byrannableinterface;

public class ProgramApp {

	public static void main(String[] args) {
		//creating the objects of class having independent activity 
		NumPrinting np=new NumPrinting();
		CharPrinting cp=new CharPrinting();
		
		//creating thread objects and assigning their activities
		Thread t1=new Thread(np);
		Thread t2=new Thread(cp);
		
		//starting the threads
		t1.start();
		t2.start();
	}

}
