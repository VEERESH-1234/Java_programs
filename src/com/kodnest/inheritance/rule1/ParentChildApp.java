package com.kodnest.inheritance.rule1;

public class ParentChildApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child C=new Child();
		System.out.println(C.x);
		//System.out.println(C.y); error
		C.displayX();
		//C.displayY(); error
	}

}
