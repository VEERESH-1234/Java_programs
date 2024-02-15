package com.kodnest.hibernate.crud.HibernateCRUD;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter the choice");
    	int choice = scan.nextInt();
    	switch(choice)
    	{
    	  case 1:create();
    	  break;
    	  case 2:read();
    	  break;
    	  case 3:update();
    	  break;
    	  case 4:delete(null);
    	  break;
    	  default:System.out.println("Incorrect choice");
    	}
    }
    public static void create()
    {
    	Configuration cfg  = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		
		Laptop lap1 = new Laptop(11,"Dell",45000);
		session.save(lap1);
		trans.commit();
		System.out.println("Object is saved");
    }
    public static void read()
    {
    	Configuration cfg  = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		
		Laptop lap = session.get(Laptop.class, 11);
		trans.commit();
		System.out.println(lap);
    }
    public static void update()
    {
    	Configuration cfg  = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		Laptop lap1 = session.get(Laptop.class, 11);
		lap1.setL_cost(50000);
		session.save(lap1);
		trans.commit();
		System.out.println(lap1);
    }
    public static void delete(Laptop lap1)
    {
    	Configuration cfg  = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		session.delete(lap1);
		trans.commit();
		System.out.println("Objects are deleted");
		
    }
}
