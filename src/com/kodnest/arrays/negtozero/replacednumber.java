package com.kodnest.arrays.negtozero;

public class replacednumber {
	public static int[] negtozero(int[]arr)
	{
		//loop to check all the elements in array
	
		
		for(int i=0;i<=arr.length-1;i++)
		{
			//condition to check the arr[i]<0
			if(arr[i]<0)
			{
				arr[i]=0;
			}
			
		}
		return arr;
		
		
	}

}
