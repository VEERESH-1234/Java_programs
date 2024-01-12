package com.kodnest.arrays.sortedornot;

import java.util.Scanner;

public class SortedApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int [] arr=new int[scan.nextInt()];
		System.out.println("Enter the "+arr.length+"numbers to be stored");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		Sorted.checking(arr);

	}

}
