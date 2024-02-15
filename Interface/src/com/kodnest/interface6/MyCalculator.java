package com.kodnest.interface6;

//partially implementing from the interface hence it is declared as abstract class
abstract public class MyCalculator implements Calculator
{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Addition result of 10 and 20 is "+(10+20));
		
	}

}
