package com.kodnest.bubblesorting;

public class Search {
	public static void bubblesort(int[]arr,int key)
	{
		//declaring a temp variable
		int temp;
		//picking all the elements in the array
		for(int i=0;i<=arr.length-2;i++)
		{
			for(int j=0;j<=arr.length-i-2;j++)
			{
				//comparing the elements with next index element
				//if it is greater than the next element then swap it
				if(arr[j]>arr[j+1])
				{
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int low=0;
		int high=arr.length-1;
		int mid=(low+high)/2;
		//checking the condition until low>high
		while(low<=high)
		{
			//if the entered key is present in the mid index
			if(key==arr[mid])
			{
				System.out.println("key "+key+" is present in the index : "+mid);
				//if the key is present,stop the searching,send the conrol back
				return;
			}
			//checking if the key is greater than the element of the mid index
			else if(key>arr[mid])
			{
				low=mid+1;
				mid=(low+high)/2;
			}
			//this will execute if the key is lesser than element of the mid index
			else
			{
				high=mid-1;
				mid=(low+high)/2;
			}
		}
		//if the key is not found in the array
		System.out.println("key "+key+" is not present");
	}

}
