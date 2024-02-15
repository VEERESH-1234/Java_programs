package com.kodnest.jdbc.ex8;

import java.util.Scanner;

public class Student 
{
	Scanner scan = new Scanner(System.in);
	int rollNo = scan.nextInt();
	String name = scan.next();
	int age = scan.nextInt();
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
