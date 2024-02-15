package com.kodnest.inheritance.methodex;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rct=new Rectangle();
		rct.draw();
		System.out.println(rct.findArea());
		
		Square sqr=new Square();
		sqr.draw();
		System.out.println(sqr.findArea());
		
		Circle crl=new Circle();
		crl.draw();
		System.out.println(crl.findArea());

	}

}
