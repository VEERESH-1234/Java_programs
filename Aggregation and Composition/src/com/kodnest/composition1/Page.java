package com.kodnest.composition1;

public class Page {
	String content;
	Page(String content)
	{
		this.content=content;
	}
	void display()
	{
		System.out.println("Page content is : "+content);
	}
}
