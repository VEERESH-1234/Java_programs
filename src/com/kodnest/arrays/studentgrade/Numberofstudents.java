package com.kodnest.arrays.studentgrade;

import java.util.Scanner;

public class Numberofstudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of students");
		int [] arr=new int[scan.nextInt()];
		System.out.println("Enter the marks of the students");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		totalstudents.students(arr);
		

	}

}
