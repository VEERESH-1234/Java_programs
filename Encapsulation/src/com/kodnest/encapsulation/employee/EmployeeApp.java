package com.kodnest.encapsulation.employee;

public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		//calling setter method
		e1.setData(13,"Mohit",45000);
		//calling getter method
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());

	}

}
