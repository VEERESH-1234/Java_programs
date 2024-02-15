package com.kodnest.inheritance.polymorphism;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rct=new Rectangle();
		Square sqr=new Square();
		Circle crl=new Circle();
		Geometry gr=new Geometry();
		gr.doActivity(rct);
		gr.doActivity(sqr);
		gr.doActivity(crl);

	}

}
