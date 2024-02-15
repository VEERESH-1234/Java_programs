package com.kodnest.inheritance.constructor3;

public class Apple extends Fruit
{
	int cost;
	public Apple()
	{
		this(345);
		System.out.println("Apples 0-para const");
	}
	public Apple(int cost)
	{
		this.cost=cost;
		color="green";
		System.out.println("Apples 1-para const");
	}
	public Apple(int cost,String color)
	{
		this();
		this.cost=cost;
		this.color=color;
		System.out.println("Apples 2-para const");
	}
	void display()
	{
		System.out.println(color);
		System.out.println(cost);
	}
}
