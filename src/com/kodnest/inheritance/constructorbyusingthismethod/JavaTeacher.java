package com.kodnest.inheritance.constructorbyusingthismethod;

public class JavaTeacher extends Teacher
{
	String className;
	public JavaTeacher()
	{
		super("KodNest");
		System.out.println("JavaTeachers 0-para const");
	}
	public JavaTeacher(String className)
	{
		this();
		this.className=className;
		System.out.println("JavaTeachers 1-para const");
	}
	void display()
	{
		System.out.println("ClassName: "+className);
		System.out.println("CollegeName: "+collegeName);
	}
}
