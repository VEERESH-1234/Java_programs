package com.kodnest.interface3;

public class ProgramApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProgramClass pc=new ProgramClass();
		pc.display();
		//cannot instantiate an interface
		ProgramInterface pi=new ProgramInterface();
		pi.display();

	}

}
