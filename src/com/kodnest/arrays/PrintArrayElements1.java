package com.kodnest.arrays;

import java.util.Scanner;

public class PrintArrayElements1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		//Creating an array
		int []arr=new int[scan.nextInt()];
		//Storing the elements in the array
		System.out.println("Enter the "+arr.length+" numbers of the array");
		for(int i=0;i<=arr.length-1;i++)
		{
			
			arr[i]=scan.nextInt();
		}
		//Displaying the elements by incrementing by 5
		System.out.println("The numbers to be stored in the array are: ");
		for(int x:arr)
		{
			
			System.out.print(x+5+" ");
			
		}
		
	}

}
