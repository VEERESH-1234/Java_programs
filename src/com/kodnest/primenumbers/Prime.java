package com.kodnest.primenumbers;

public class Prime {
	public static void find(int [] arr)
	{
		int count=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			count=0;
			for(int j=2;j<=arr[i];j++)
			{
				if(arr[i]%j==0)
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.print(arr[i]);
				System.out.println(" is prime numbers");
			}
		}
	}

}
