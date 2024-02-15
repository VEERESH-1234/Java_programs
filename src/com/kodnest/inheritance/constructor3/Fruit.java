package com.kodnest.inheritance.constructor3;

public class Fruit {
	String color;
	public Fruit()
	{
		this("Pink");
		System.out.println("Fruit 0-para const");
	}
	public Fruit(String color)
	{
		this.color=color;
		System.out.println("Fruit 1-para const");
	}

}
