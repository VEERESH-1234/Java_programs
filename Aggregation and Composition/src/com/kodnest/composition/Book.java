package com.kodnest.composition;

public class Book {
	Page pg;
	Book()
	{
		pg=new Page("Java content");
	}
	void read()
	{
		System.out.println("Reading book");
		pg.display();
	}
}
