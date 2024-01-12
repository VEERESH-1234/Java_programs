package com.kodnest.bubblesorting;

public class Bubblesort {
	public static int[] bubblesorting(int[]arr)
	{
		//temp variable to be perform
		int temp;
		//picking all the elements in array
		for(int i=0;i<=arr.length-2;i++)
		{
			for(int j=0;j<=arr.length-i-2;j++)
			{
				//comparing the elements with its next index element
				//if it is greater than next element, swap it
				if(arr[j]>arr[j+1])
				{
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		//returning the sorted array 
		return arr;
	}

}
