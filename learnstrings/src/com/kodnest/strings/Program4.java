package com.kodnest.strings;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="JAVA";
		String s2="SQL";
		String s3=s1+s2;
		String s4=s1+s2;
		if(s3==s4)
		{
			System.out.println("References are equal");
		}
		else
		{
			System.out.println("References are not equal");
		}
		if(s3.equals(s4))
		{
			System.out.println("String values are equal");
		}
		else
		{
			System.out.println("String values are not equal");
		}

	}

}
