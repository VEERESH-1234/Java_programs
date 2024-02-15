package com.kodnest.multithreading.singlerunmethod;

public class ProgramApp {

	public static void main(String[] args) {
		//Creating object of the class in which activities are present
		Program prog=new Program();
		
		//creating the object of the thread class and assigning the activities
		Thread t1=new Thread(prog);
		Thread t2=new Thread(prog);
		
		//changing the name of threads
		t1.setName("Number");
		t2.setName("Char");
		
		//calling the run() by calling the start
		t1.start();//starting t1 thread to do number printing
		t2.start();//starting t2 thread to do character printing

	}

}
