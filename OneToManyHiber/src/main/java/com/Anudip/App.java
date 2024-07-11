package com.Anudip;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        
        cfg.configure("hiber.cfg.xml");
        
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        Transaction tx = session.beginTransaction();
        
        Parent p = new Parent();
        
        Child child1 = new Child();
        Child child2 = new Child();
        
        child1.setC_id(1);
        child1.setCName("Ganesh");
        child1.setParent(p);
        
        child2.setC_id(2);
        child2.setCName("Sweta");
        child2.setParent(p);
        
        p.setP_id(1);
        p.setPName("Anita");
        
        Set<Child> childList = new HashSet<Child>();
        childList.add(child1);
        childList.add(child2);
        
        p.setChild(childList);
        
        session.save(child1);
        session.save(child2);
        session.save(p);
        
        tx.commit();
        session.close();
        
       }
}
