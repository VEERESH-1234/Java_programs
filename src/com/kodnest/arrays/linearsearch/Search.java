package com.kodnest.arrays.linearsearch;

public class Search {
	public static String linearsearch(int[]arr,int key)
	{
		//loop to check all the elements in array
	
		
		for(int i=0;i<=arr.length-1;i++)
		{
			//condition to compare the key with arr[i]
			if(key==arr[i])
			{
				return "key "+key+" is present at index : "+i;
			}
			
		}
		return "key "+key+" is not present";
		
	}

}
