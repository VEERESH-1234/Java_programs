package com.kodnest.arrays.student;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//Asking the total no of student objects to be created
		System.out.println("Enter the no of students");
		int StudentNo=scan.nextInt();
		//creating the array for storing the student objects
		Student[]arr=new Student[StudentNo];
		//Creating the student objects and storing it in the array
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the rollNo for Student: "+(i+1));
			int rollNo=scan.nextInt();
			System.out.println("Enter the name for student: "+(i+1));
			String name=scan.next();
			System.out.println("Enter the marks for student: "+(i+1));
			int marks=scan.nextInt();
			//Creating and storing the student objects for above entered data member value
		    arr[i]=new Student(rollNo,name,marks);
		}
		//Displaying the array elements as rollNo,name and marks for every student objects
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i].rollNo+" "+arr[i].name+" "+arr[i].marks);
		}

	}

}
