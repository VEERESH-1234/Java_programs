package com.kodnest.strings;

public class Program13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="SACHIN";
		String s2="SOURAV";
		int res=s1.compareTo(s2);
		if(res>0)
		{
			System.out.println("String s1 is greater");
		}
		else if(res<0)
		{
			System.out.println("String s2 is greater");
		}
		else
		{
			System.out.println("Both strings are equal");
		}

	}

}
