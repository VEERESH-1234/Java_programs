package com.kodnest.arrays;

import java.util.Scanner;

public class PrintArrayApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of an array");
		//Creating an array
		int []arr=new int[scan.nextInt()];
		//Storing the elements of the array
		System.out.println("Enter the "+arr.length+" numbers of elements in the array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		PrintArray.printArray(arr);

	}

}
