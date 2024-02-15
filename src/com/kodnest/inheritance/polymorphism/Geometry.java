package com.kodnest.inheritance.polymorphism;

public class Geometry {
	void doActivity(Shape sh)
	{
		sh.draw();
		System.out.println(sh.findArea());
		
	}

}
