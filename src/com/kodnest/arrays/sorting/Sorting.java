package com.kodnest.arrays.sorting;

public class Sorting {
	public static int[] bubbleSortAsc(int [] arr)
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
	public static int[] selectionSortAsc(int [] arr)
	{
		//Starting index i from 0 and going until arr.length-2
		for(int i=0;i<=arr.length-2;i++)
		{
			//Assuming arr[i] is the minimum element and storing it in min
			int min=arr[i];
			//Storing i in pos
			int pos=i;
			//Checking all the elements after i
			for(int j=i+1;j<=arr.length-1;j++)
			{
				//Comparing arr[j] with min, if true
				if(arr[j] < min)
				{
					//assigning arr[j] to min
					min=arr[j];
					//assigning j to pos
					pos=j;
				}
			}
			//Swapping the elements at i and pos
			int temp1;
			int temp=arr[pos];
			arr[pos]=arr[i];
			arr[i]=temp;
		}
		//Returning the sorted array
		return arr;
	}
	public static int[] insertionSortAsc(int [] arr)
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
	public static int[] bubbleSortDesc(int [] arr)
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
				if(arr[j]<arr[j+1])
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
	public static int[] selectionSortDesc(int [] arr)
	{
		//Starting index i from 0 and going until arr.length-2
		for(int i=0;i<=arr.length-2;i++)
		{
			//Assuming arr[i] is the minimum element and storing it in min
			int min=arr[i];
			//Storing i in pos
			int pos=i;
			//Checking all the elements after i
			for(int j=i+1;j<=arr.length-1;j++)
			{
				//Comparing arr[j] with min, if true
				if(arr[j] < min)
				{
					//assigning arr[j] to min
					min=arr[j];
					//assigning j to pos
					pos=j;
				}
			}
			//Swapping the elements at i and pos
			int temp1;
			int temp=arr[pos];
			arr[pos]=arr[i];
			arr[i]=temp;
		}
		//Returning the sorted array
		return arr;
	}
	public static int[] insertionSortDesc(int [] arr)
	{
		//Starting index i from 0 and going until arr.length-1
		for(int i=1;i<=arr.length-1;i++)
		{
			//j will be moving i-1
			int j=i-1;
			//Storing the element in arr[i]
			int elem=arr[i];
			//Comparing arr[j] with element,if true
			if(j>=0 && arr[j]<elem)
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
