package com.kodnest.arrays.temperature;

public class Temperature {
	public static void sum(int[]arr)
	{
		float sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			sum=sum+arr[i];
		}
		float average=(sum/arr.length);
		System.out.println(average);
		
	}

}
