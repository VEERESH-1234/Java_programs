package com.kodnest.hibernate.crud.HibernateCRUD;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop 
{
	@Override
	public String toString() {
		return "Laptop [l_id=" + l_id + ", l_name=" + l_name + ", l_cost=" + l_cost + "]";
	}
	@Id
	int l_id;
	String l_name;
	int l_cost;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(int l_id, String l_name, int l_cost) {
		super();
		this.l_id = l_id;
		this.l_name = l_name;
		this.l_cost = l_cost;
	}
	public int getL_id() {
		return l_id;
	}
	public void setL_id(int l_id) {
		this.l_id = l_id;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public int getL_cost() {
		return l_cost;
	}
	public void setL_cost(int l_cost) {
		this.l_cost = l_cost;
	}
	
	
}
