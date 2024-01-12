package com.kodnest.swapping;

import java.util.Scanner;

public class ArraySwapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		//creating an array
		int [] arr=new int [scan.nextInt()];
		//storing the elements in array
		System.out.println("Enter the "+arr.length+" numbers to be stored");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		//Asking the user to enter the 2 indexes to be swapped
		System.out.println("Enter 2 indexes in the range of 0 to "+(arr.length-1));
		int i1=scan.nextInt();
		int i2=scan.nextInt();
		int temp;
		//Displaying the array elements before swapping
		System.out.print("Before swapping the array elements are : ");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		//swapping the elements at both sides
		temp=arr[i2];
		arr[i2]=arr[i1];
		arr[i1]=temp;
		//Displaying the array elements after the swapping
		System.out.print("After swapping the array elements ara : ");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}

	}

}
