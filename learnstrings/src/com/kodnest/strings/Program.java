package com.kodnest.strings;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="KodNest";
		String s2="KodNest";
		if(s1==s2)
		{
			System.out.println("References are equal");
		}
		else
		{
			System.out.println("References are not equal");
		}
		if(s1.equals(s2))
		{
			System.out.println("String values are equal");
		}
		else
		{
			System.out.println("String values are not equal");
		}

	}

}
