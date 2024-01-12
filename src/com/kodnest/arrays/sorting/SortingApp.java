package com.kodnest.arrays.sorting;

import java.util.Scanner;

public class SortingApp {

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
		System.out.println("Enter the operation");
		int operation=scan.nextInt();
		//Displaying the elements before sorting
		System.out.println("Before sorting the elements are : ");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		//Performing Sorting
		switch(operation)
		{
		case 1:int [] SortedArr=Sorting.bubbleSortAsc(arr);
		//Displaying the elements after sorting
		System.out.println("After sorting the elements are : ");
		for(int x:SortedArr)
		{
			System.out.print(x+" ");
		}
		break;
		case 2:int [] SortedArr1=Sorting.selectionSortAsc(arr);
		//Displaying the elements after sorting
		System.out.println("After sorting the elements are : ");
		for(int x:SortedArr1)
		{
			System.out.print(x+" ");
		}
		break;
		case 3:int [] SortedArr2=Sorting.insertionSortAsc(arr);
		//Displaying the elements after sorting
		System.out.println("After sorting the elements are : ");
		for(int x:SortedArr2)
		{
			System.out.print(x+" ");
		}
		break;
		case 4:int [] SortedArr3=Sorting.bubbleSortDesc(arr);
		//Displaying the elements after sorting
		System.out.println("After sorting the elements are : ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		break;
		case 5:int [] SortedArr4=Sorting.selectionSortDesc(arr);
		//Displaying the elements after sorting
		System.out.println("After sorting the elements are : ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		break;
		case 6:int [] SortedArr5=Sorting.insertionSortDesc(arr);
		//Displaying the elements after sorting
		System.out.println("After sorting the elements are : ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}


		}

	}

}
