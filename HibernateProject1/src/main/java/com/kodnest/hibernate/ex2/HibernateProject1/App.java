package com.kodnest.hibernate.ex2.HibernateProject1;

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
        
        //Creating the objects of Bike Class
        Bike bk1 = new Bike();
        Bike bk2 = new Bike();
        Bike bk3 = new Bike();
        
        //Creating the objects of Student Class
        Student st1 = new Student(11,"Ajay",24,bk1);
        Student st2 = new Student(12,"Amit",25,bk2);
        Student st3 = new Student(13,"Anuj",23,bk3);
        
        bk1.setBikeId(1);
        bk1.setBrand("Hero");
        bk1.setColor("Black");
        bk1.setSt(st1);
        
        bk2.setBikeId(2);
        bk2.setBrand("KTM");
        bk2.setColor("Red");
        bk2.setSt(st2);
        
        bk3.setBikeId(3);
        bk3.setBrand("Honda");
        bk3.setColor("Blue");
        bk3.setSt(st3);
        
        
        //Saving the student objects
        session.save(st1);
        session.save(st2);
        session.save(st3);
        
        //Saving the Bike objects
        session.save(bk1);
        session.save(bk2);
        session.save(bk3);
        
        trans.commit();
        System.out.println("Student object is created");
        System.out.println("Bike object is created");
    }
}
