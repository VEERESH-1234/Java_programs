package com.kodnest.arrays;


public class PrintArray {
	public static void printArray(int []arr)
	{
		
		
		//Displaying the elements of the array in forward direction using enhance loop
		System.out.println("The elements of the array in forward direction are: ");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		//Displaying the elements of the array in reverse direction
		System.out.println("The elements of the array in reverse direction are: ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}

	
}
