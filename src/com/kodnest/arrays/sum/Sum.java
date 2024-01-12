package com.kodnest.arrays.sum;

public class Sum {
	public static int[] addingtwoarrayselements(int [] arr1,int [] arr2,int [] arr3)
	{
		//addition of array1 elements and array2 elements
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr3[i]=arr1[i]+arr2[i];
		}
		return arr3;
		
		
	}
	
}
