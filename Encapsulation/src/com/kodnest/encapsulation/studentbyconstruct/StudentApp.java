package com.kodnest.encapsulation.studentbyconstruct;

public class StudentApp {

	public static void main(String[] args) {
		//Create first student object and setting the values to the private data members through constructor
		Student s1=new Student(1,"Ajay",23,98.5f);
		//Getting the values of private data members through getter method
		System.out.println(s1.getRollNo()+" "+s1.getName()+" "+s1.getAge()+" "+s1.getPercentage());
		
		//Create second student object and setting the values to the private data members through constructor
		Student s2=new Student(2,"Amit",24,95.5f);
		//Getting the values of private data members through getter method
		System.out.println(s2.getRollNo()+" "+s2.getName()+" "+s2.getAge()+" "+s2.getPercentage());

	}

}
