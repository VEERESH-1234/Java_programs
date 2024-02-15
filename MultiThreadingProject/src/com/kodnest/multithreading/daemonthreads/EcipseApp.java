package com.kodnest.multithreading.daemonthreads;

public class EcipseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Typing typ=new Typing();
		Compilation cmp=new Compilation();
		Saving sav=new Saving();
		typ.start();
		
		cmp.setDaemon(true);
		sav.setDaemon(true);
		cmp.start();
		sav.start();

	}

}
