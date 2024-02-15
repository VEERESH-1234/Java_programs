package com.kodnest.inheritance.constructorbyusingthismethod;

public class Teacher {
	String collegeName;
	public Teacher()
	{
		System.out.println("Teachers 0-para const");
	}
	public Teacher(String collegeName)
	{
		this();
		this.collegeName=collegeName;
		System.out.println("Teachers 1-para const");
	}

}
