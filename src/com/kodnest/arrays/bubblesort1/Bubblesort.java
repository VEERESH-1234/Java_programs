package com.kodnest.arrays.bubblesort1;

import java.util.Scanner;

public class Bubblesort {
	int[] createArray()
	{
		Scanner scan=new Scanner(System.in);
		//creating the array
		System.out.println("Enter the size of an array");
		int[]arr=new int[scan.nextInt()];
		//Storing the elements in the array
		System.out.println("Enter "+arr.length+" elements to be stored in the array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		//returning the created array
		return arr;
	}
	int[] bubbleSort(int [] arr)
	{
		int temp;
		//traversing through complete array
		for(int i=0;i<arr.length-1;i++)
		{
			//going to the next element and comparing
			for(int j=0;j<arr.length-1-i;j++)
			{
				//checking whether the next element is smaller than previous element
				if(arr[j+1]<arr[j])
				{
					//if smaller,swapping
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		//returning the sorted array
		return arr;
	}
	void displayArray(int[]sortedArr)
	{
		System.out.println("The sorted elemets are: ");
		//printing the elements in the sorted array
		for(int x:sortedArr)
		{
			System.out.print(x+" ");
		}
	}

}
