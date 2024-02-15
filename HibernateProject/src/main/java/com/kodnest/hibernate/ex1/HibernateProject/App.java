package com.kodnest.hibernate.ex1.HibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
       Configuration cfg = new Configuration();
       cfg.configure();
       SessionFactory factory = cfg.buildSessionFactory();
       Session session = factory.openSession();
       Transaction trans = session.beginTransaction();
       Student st = new Student(12,"Amit",29);
       session.save(st);
       trans.commit();
       System.out.println("Student object is saved");
    }
}
