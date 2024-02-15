package com.kodnest.inheritance.upcasting;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape sh=new Shape();
		Rectangle rct=new Rectangle();
		Square sqr=new Square();
		Circle crl=new Circle();
		sh=rct;
		sh.draw();
		System.out.println(sh.findArea());
		
		sh=sqr;
		sh.draw();
		System.out.println(sh.findArea());
		
		sh=crl;
		sh.draw();
		System.out.println(sh.findArea());

	}

}
