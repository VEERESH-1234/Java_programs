package com.kodnest.arrays.selectionsort;

public class SelectionSort {
	public static int[] sorting(int [] arr)
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
			int temp;
			temp=arr[pos];
			arr[pos]=arr[i];
			arr[i]=temp;
		}
		//Returning the sorted array
		return arr;
	}

}
