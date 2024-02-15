package com.kodnest.hibernate.onetooneunidir.HibernateProject4;

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
        
        Bike bk1 = new Bike(001,"Hero","Black");
        Bike bk2 = new Bike(002,"KTM","Red");
        Bike bk3 = new Bike(003,"Honda","Blue");
        
        Student st1 = new Student(11,"Ajay",24,bk1);
        Student st2 = new Student(12,"Amit",25,bk2);
        Student st3 = new Student(13,"Anuj",23,bk3);
        
        session.save(bk1);
        session.save(bk2);
        session.save(bk3);
        session.save(st1);
        session.save(st2);
        session.save(st3);
        trans.commit();
        System.out.println("Objects are created");
    }
}
