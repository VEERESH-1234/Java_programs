package com.kodnest.arrays.binarysearch;

public class Search {
	public static void binarysearch(int[]arr,int key)
	{
		
		int low=0;
		int high=arr.length-1;
		int mid=(low+high)/2;
		//checking the key until low>=high
		while(low<=high)
		{
			//checking if key is present at mid index
			if(key==arr[mid])
			{
				System.out.println("key "+key+" is present in index : "+mid);
				//if key is present, stop the searching, and send the control back
				return;
			}
			//checking if the key is greater than the element present at mid index
			else if(key>arr[mid])
			{
				low=mid+1;
				mid=(low+high)/2;

			}
			//this will execute if key is lesser than the element present at mid index
			else
			{

				high=mid-1;
				mid=(low+high)/2;
			}
		}
		//if key is not present in the array
		System.out.println("key is not present");
	}

}
