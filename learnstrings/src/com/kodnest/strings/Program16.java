package com.kodnest.strings;

public class Program16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java SQL Python";
		System.out.println("Original string is "+str);
		//replacing substring SQL with Web
		String newstr1=str.replace("SQL","Web");
		System.out.println(newstr1);
		//replacing the character a with o
		String newstr2=str.replace('a','o');
		System.out.println(newstr2);

	}

}
