package com.kodnest.multithreading.multithread;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumPrinting np=new NumPrinting();
		CharPrinting cp=new CharPrinting();
		np.start();
		cp.start();

	}

}
