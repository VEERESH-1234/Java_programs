package com.kodnest.arrays.sum;

import java.util.Scanner;

public class SumofTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//Asking the user to enter the size of an array
		System.out.println("Enter the size of an array");
		//creating an arr
		int [] arr1=new int [scan.nextInt()];
		int [] arr2=new int [scan.nextInt()];
		int [] arr3=new int [scan.nextInt()];
		//storing the array1 elements
		System.out.println("Enter the "+arr1.length+" numbers to be stored");
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr1[i]=scan.nextInt();
		}
		//storing the array2 elements
		System.out.println("Enter the "+arr2.length+" numbers to be stored");
		for(int i=0;i<=arr2.length-1;i++)
		{
			arr2[i]=scan.nextInt();
		}
		//invoking the addingtwoarrayselements()
		int [] storing=Sum.addingtwoarrayselements(arr1,arr2,arr3);
		//displaying the 3rd array elements
		System.out.println("Sum of the two arrays in 3rd array is : ");
		for(int x:arr3)
		{
			System.out.print(x+" ");
		}
		

	}

}
