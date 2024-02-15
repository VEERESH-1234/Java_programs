package com.kodnest.multithreading.program1;

public class ProgramApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t2=Thread.currentThread();
		System.out.println(t2);
		
		Program p=new Program();
		p.setName("Program Thread");
		p.start();

	}

}
