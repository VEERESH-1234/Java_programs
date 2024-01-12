package com.kodnest.methodhiding;

public class ParentChildApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p1=new Parent();
		p1.display();
		System.out.println("--------");
		Parent p2=new Child();
		p2.display();
		System.out.println("-------");
		Child ch=new Child();
		ch.display();

	}

}
