package com.kodnest.arrays;

import java.util.Scanner;

public class SwappingElementsoftheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int []arr=new int[scan.nextInt()];
		System.out.println("Enter the "+arr.length+" numbers in the array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the 2 indexes to be swapped");
		int i1=scan.nextInt();
		int i2=scan.nextInt();
		int temp;
		System.out.println("The elements in the array are before swapping: ");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		temp=arr[i2];
		arr[i2]=arr[i1];
		arr[i1]=temp;
		System.out.println("The elements in the array are after swapping: ");
		
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		

	}

}
