package com.kodnest.hibernate.ex2.HibernateProject1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Bike 
{
	@Id
	int bikeId;
	String brand;
	String color;
	@OneToOne
	Student st;
	public Bike() 
	{
	
	}
	public Bike(int bikeId, String brand, String color, Student st) {
		super();
		this.bikeId = bikeId;
		this.brand = brand;
		this.color = color;
		this.st = st;
	}
	public int getBikeId() {
		return bikeId;
	}
	public void setBikeId(int bikeId) {
		this.bikeId = bikeId;
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
	public Student getSt() {
		return st;
	}
	public void setSt(Student st) {
		this.st = st;
	}
	
	
}
