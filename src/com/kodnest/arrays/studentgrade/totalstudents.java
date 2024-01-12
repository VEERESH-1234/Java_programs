package com.kodnest.arrays.studentgrade;

public class totalstudents {
	public static void students(int [] arr)
	{
		int count = 0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>75)
			{
				count++;
				
			}
			
		}
		System.out.println("Total number of students who got above 75 are : "+count);
	}

}
