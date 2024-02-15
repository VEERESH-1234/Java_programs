package com.kodnest.hibernate.manytomany.HibernateProject3;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee 
{
	@Id
	int e_id;
	String e_Name;
	String e_Team;
	@ManyToMany
	List<Technology> technology;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int e_id, String e_Name, String e_Team, List<Technology> technology) {
		super();
		this.e_id = e_id;
		this.e_Name = e_Name;
		this.e_Team = e_Team;
		this.technology = technology;
	}
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public String getE_Name() {
		return e_Name;
	}
	public void setE_Name(String e_Name) {
		this.e_Name = e_Name;
	}
	public String getE_Team() {
		return e_Team;
	}
	public void setE_Team(String e_Team) {
		this.e_Team = e_Team;
	}
	public List<Technology> getTechnology() {
		return technology;
	}
	public void setTechnology(List<Technology> technology) {
		this.technology = technology;
	}
	
}

