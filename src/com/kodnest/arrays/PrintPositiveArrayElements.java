package com.kodnest.arrays;

import java.util.Scanner;

public class PrintPositiveArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		//Creating an array
		int []arr=new int[scan.nextInt()];
		//Storing the elements in the array
		System.out.println("Enter the "+arr.length+" numbers to be stored in the array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
			
		}
		//Displaying the elements of the array if it is positive
		System.out.println("The elements of the array are: ");
		for(int x:arr)
		{
			if(x>0)
			{
				System.out.print(x+" ");
			}
		}

	}

}
