package com.kodnest.bubblesorting;

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size");
		//create an array
		int []arr=new int[scan.nextInt()];

		//Storing the elements in array
		System.out.println("Enter the "+arr.length+" numbers to be stored in the array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		//Displaying the elements before sorting
		System.out.println("Before sorting the elements are : ");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		//Performing Sorting
		int [] SortedArr=Bubblesort.bubblesorting(arr);
		//Displaying the elements after sorting
		System.out.println("After sorting the elements are : ");
		for(int x:SortedArr)
		{
			System.out.print(x+" ");
		}

	}

}
