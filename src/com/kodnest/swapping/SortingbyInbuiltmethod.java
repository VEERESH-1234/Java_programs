package com.kodnest.swapping;

import java.util.Arrays;
import java.util.Scanner;

public class SortingbyInbuiltmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		//creating an array
		int []arr=new int[scan.nextInt()];
		//Storing the elements in the array
		System.out.println("Enter the "+arr.length+" numbers to be stored");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		//Invoking the method of sort
		Arrays.sort(arr);
		//Displaying the elements in the sorted order
		System.out.println("The array elements are");
		for(int x:arr)
		{
			System.out.println(x+" ");
		}
		

	}

}
