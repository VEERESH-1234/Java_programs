package com.kodnest.arrays.countingevennumbers;

public class Even {
	public static void count(int [] arr)
	{
		int count = 0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0)
			{
				count++;
			}
		}
		System.out.println("Total number of even numbers are : "+count);
	}

}
