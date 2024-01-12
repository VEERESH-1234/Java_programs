package com.kodnest.arrays.keysearch;

public class KeySearch {
	public static void display(int[]arr,int key)
	{
		int count=0;
		for(int i=0;i<=arr.length-2;i++)
		{
			if(arr[i]<arr[i+1])
			{
				count++;
			}
		}
		if(count==arr.length-1)
		{
			System.out.println("It is sorted array");
			int low=0;
			int high=arr.length-1;
			int mid=(low+high)/2;
			while(low<=high)
			{
				if(key==arr[mid])
				{
					System.out.println("Key "+key+" is found at index "+mid);
					return;
				}
				else if(key>=arr[mid])
				{
					low=mid+1;
					mid=(low+high)/2;
				}
				else
				{
					high=mid-1;
					mid=(low+high)/2;
				}
			}
			System.out.println("key "+key+" is not found");
		}
		
		else
		{
			System.out.println("It is not sorted array");
			for(int i=0;i<=arr.length-2;i++)
			{
				int min=arr[i];
				int pos=i;
				for(int j=i+1;j<=arr.length-1;j++)
				{
					if(arr[j]<min)
					{
						min=arr[j];
						pos=j;
					}
				}
				int temp=arr[pos];
				arr[pos]=arr[i];
				arr[i]=temp;
			}
			System.out.println("It is sorted array");
			int low=0;
			int high=arr.length-1;
			int mid=(low+high)/2;
			while(low<=high)
			{
				if(key==arr[mid])
				{
					System.out.println("Key "+key+" is found at index "+mid);
					return;
				}
				else if(key>=arr[mid])
				{
					low=mid+1;
					mid=(low+high)/2;
				}
				else
				{
					high=mid-1;
					mid=(low+high)/2;
				}
			}
			System.out.println("key "+key+" is not found");
		}
	}
}
