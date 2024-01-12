package com.kodnest.abstraction.abstractclass;

public class ParentChildApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p=new Parent();//Error, bcz abstract classes cannot be instantiated
		Child c=new Child();
		p=c;
		p.display();

	}

}
