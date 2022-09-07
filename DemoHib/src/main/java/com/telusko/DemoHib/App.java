package com.telusko.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
       Alian telusko = new Alian();
       
       telusko.setAid(101);
       telusko.setName("sai");
       telusko.setColor("green");
       
       Configuration con = new Configuration().configure().addAnnotatedClass(Alian.class);
       
       SessionFactory sf=  con.buildSessionFactory();
       
       Session session = sf.openSession();
       
       session.save(telusko);
       
    }
}
