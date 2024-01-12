package com.kodnest.abstraction.consistof;

public class ProgramChildApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program.display1();//calling static method
		ProgramChild1 pc=new ProgramChild1();
		pc.display2();//calling non static method
		pc.display3();//calling overriden method
		
		

	}

}
