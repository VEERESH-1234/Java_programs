package com.kodnest.arrays.sortedornot;

public class Sorted {
	public static void checking(int [] arr)
	{
		int count=0;
		for(int i=0;i<=arr.length-2;i++)
		{
			if(arr[i]<arr[i+1])
			{
				count++;
			}
		}
		if(count==arr.length-1)
		{
			System.out.println("It is sorted array");
		}
		else
		{
			System.out.println("It is not sorted array");
		}
	}

}
