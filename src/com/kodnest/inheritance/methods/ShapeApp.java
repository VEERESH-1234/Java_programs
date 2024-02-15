package com.kodnest.inheritance.methods;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle cr=new Circle();
		//invoking inherited methods
		cr.draw();
		//invoking overriden methods
		System.out.println(cr.calculateArea());
		//invoking child-specific method
		System.out.println(cr.calculatePerimeter());

	}

}
