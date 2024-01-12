package com.kodnest.arrays.insertionsort;

public class InsertionSort {
	public static int[] sorting(int [] arr)
	{
		//Starting index i from 0 and going until arr.length-1
		for(int i=1;i<=arr.length-1;i++)
		{
			//j will be moving i-1
			int j=i-1;
			//Storing the element in arr[i]
			int elem=arr[i];
			//Comparing arr[j] with element,if true
			if(j>=0 && arr[j]>elem)
			{
				//assigning arr[j+1] to arr[j]
				arr[j+1]=arr[j];
				//decrement j
				j--;
			}
			//Storing the arr[j+1] with elem
			arr[j+1]=elem;
		}
		//returning the sorted array
		return arr;
	}

}
