package com.kodnest.arrays.smallnumber;

public class smallnumber {
	public static void find(int [] arr)
	{
		int small=arr[0];
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]<=small)
			{
				small=arr[i];
			}
		}
		System.out.println("smallest number in an array is : "+small);
	}

}
