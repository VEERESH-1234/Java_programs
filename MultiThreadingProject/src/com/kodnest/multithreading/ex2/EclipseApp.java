package com.kodnest.multithreading.ex2;

public class EclipseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Typing typ=new Typing();
		Compilation cmp=new Compilation();
		Saving sav=new Saving();
		
		typ.start();
		cmp.start();
		sav.start();

	}

}
