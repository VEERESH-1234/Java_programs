package com.kodnest.hibernate.onetooneunidir.HibernateProject4;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bike 
{
	@Id
	int bike_id;
	String brand;
	String color;
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bike(int bike_id, String brand, String color) {
		super();
		this.bike_id = bike_id;
		this.brand = brand;
		this.color = color;
	}
	public int getBike_id() {
		return bike_id;
	}
	public void setBike_id(int bike_id) {
		this.bike_id = bike_id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
