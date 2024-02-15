package com.kodnest.inheritance.hybridinheritance;

public class SoftwareDeveloperApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BackEndDeveloper bd=new BackEndDeveloper();
		bd.doProject();
		bd.doBackEndProject();
		
		JavaDeveloper jd=new JavaDeveloper();
		jd.doProject();
		jd.doBackEndProject();
		jd.doJavaProject();
		
		FrontEndDeveloper fd=new FrontEndDeveloper();
		fd.doProject();
		fd.doWebProject();

	}

}
