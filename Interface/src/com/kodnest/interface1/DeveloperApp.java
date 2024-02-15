package com.kodnest.interface1;

public class DeveloperApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BackEndDeveloper bd=new BackEndDeveloper();
		FrontEndDeveloper fd=new FrontEndDeveloper();
		callmethods(bd);
		callmethods(fd);

	}

	public static void callmethods(DeveloperActivities dev) {
		// TODO Auto-generated method stub
		dev.knowledge();
		dev.project();
		
	}

}
