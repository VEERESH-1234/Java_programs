package com.kodnest.hibernate.manytomany.HibernateProject3;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Technology 
{
	@Id
	int t_Id;
	String t_Name;
	@ManyToMany
	List<Employee> employee;
	public Technology() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Technology(int t_Id, String t_Name, List<Employee> employee) {
		super();
		this.t_Id = t_Id;
		this.t_Name = t_Name;
		this.employee = employee;
	}
	public int getT_Id() {
		return t_Id;
	}
	public void setT_Id(int t_Id) {
		this.t_Id = t_Id;
	}
	public String getT_Name() {
		return t_Name;
	}
	public void setT_Name(String t_Name) {
		this.t_Name = t_Name;
	}
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
}
