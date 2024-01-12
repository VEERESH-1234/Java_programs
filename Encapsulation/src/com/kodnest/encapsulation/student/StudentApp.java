package com.kodnest.encapsulation.student;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		//calling setter method
		s1.setData(31,"Shrinivas",23,92.5f);
		//calling getter method
		s1.getData();
		Student s2=new Student();
		//calling setter method
		s2.setData(36,"Veeresh",23,93.5f);
		//calling getter method
		s2.getData();

	}

}
