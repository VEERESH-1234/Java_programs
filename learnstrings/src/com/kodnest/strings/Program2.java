package com.kodnest.strings;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="JAVA";
		String s2="Java";
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
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("String values are equal after ignoring case");
		}
		else
		{
			System.out.println("String values are not equal after ignoring the case");
		}

	}

}
