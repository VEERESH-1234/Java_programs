package com.kodnest.arrays.sumofpositivenum;

public class SumPos {
	public static void summing(int [] arr)
	{
		int sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>0)
			{
				sum=sum+arr[i];
			}
		}
		System.out.println(sum);
	}

}
