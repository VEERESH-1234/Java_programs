package com.kodnest.hibernate.manytomany.HibernateProject3;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main( String[] args )
	{
		Configuration cfg  = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();

		//creating the technology objects
		Technology t1 = new Technology();
		Technology t2 = new Technology();
		Technology t3 = new Technology();
		Technology t4 = new Technology();

		//creating the employee objects
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee();
		Employee e5 = new Employee();

		//Creating the list for storing employees
		//adding the employees to list1
		List<Employee> list1 = new ArrayList<Employee>();
		list1.add(e1);
		list1.add(e3);
		list1.add(e5);

		List<Employee> list2 = new ArrayList<Employee>();
		//adding the employees to list2
		list2.add(e1);
		list2.add(e2);
		list2.add(e4);
		list2.add(e5);

		List<Employee> list3 = new ArrayList<Employee>();
		//adding the employees to list3
		list3.add(e2);
		list3.add(e4);
		list3.add(e5);

		List<Employee> list4 = new ArrayList<Employee>();
		//adding the employees to list4
		list4.add(e1);
		list4.add(e2);
		list4.add(e3);
		list4.add(e4);
		list4.add(e5);

		//Creating the list for storing technology
		//adding the technology to list5
		List<Technology> list5 = new ArrayList<Technology>();
		list5.add(t1);
		list5.add(t2);
		list5.add(t4);

		List<Technology> list6 = new ArrayList<Technology>();
		//adding the technology to list6
		list6.add(t2);
		list6.add(t3);
		list6.add(t4);

		List<Technology> list7 = new ArrayList<Technology>();
		//adding the technology to list7
		list7.add(t1);
		list7.add(t4);

		List<Technology> list8 = new ArrayList<Technology>();
		//adding the technology to list8
		list8.add(t2);
		list8.add(t3);
		list8.add(t4);

		List<Technology> list9 = new ArrayList<Technology>();
		//adding the technology to list9
		list9.add(t1);
		list9.add(t2);
		list9.add(t3);
		list9.add(t4);

		//setting the values of technology
		t1.setT_Id(123);
		t1.setT_Name("Java");
		t1.setEmployee(list1);

		t2.setT_Id(124);
		t2.setT_Name("MySQL");
		t2.setEmployee(list2);

		t3.setT_Id(125);
		t3.setT_Name("Python");
		t3.setEmployee(list3);

		t4.setT_Id(126);
		t4.setT_Name("React");
		t4.setEmployee(list4);

		//setting the values of employee
		e1.setE_id(11);
		e1.setE_Name("Prakash");
		e1.setE_Team("Team-A");
		e1.setTechnology(list5);

		e2.setE_id(12);
		e2.setE_Name("Praveen");
		e2.setE_Team("Team-B");
		e2.setTechnology(list6);

		e3.setE_id(13);
		e3.setE_Name("Pooja");
		e3.setE_Team("Team-C");
		e3.setTechnology(list7);

		e4.setE_id(14);
		e4.setE_Name("Priya");
		e4.setE_Team("Team-A");
		e4.setTechnology(list8);

		e5.setE_id(15);
		e5.setE_Name("Prateek");
		e5.setE_Team("Team-B");
		e5.setTechnology(list9);

		//saving the objects
		session.save(t1);
		session.save(t2);
		session.save(t3);
		session.save(t4);
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e4);
		session.save(e5);

		trans.commit();
		System.out.println("Objects are created");
	}
}
