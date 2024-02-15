package com.kodnest.inheritance.robo;

public class RobotApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeacherRobot tr=new TeacherRobot();
		tr.name="TeacherRobo";
		tr.talk();
		tr.walk();
		tr.charge();
		tr.teach();
		
		ChefRobot cr=new ChefRobot();
		cr.name="ChefRobo";
		cr.talk();
		cr.walk();
		cr.charge();
		cr.cook();
		
		DoctorRobot dr=new DoctorRobot();
		dr.name="DoctorRobo";
		dr.talk();
		dr.walk();
		dr.charge();
		dr.surgery();

	}

}
