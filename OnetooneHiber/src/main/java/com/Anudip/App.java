package com.Anudip;

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
        
        Husband hs = new Husband();
        Wife wf = new Wife();
        
        hs.setH_id(1);
        hs.sethName("Amitabh");
        hs.setWife(wf);
        
        wf.setW_id(1);
        wf.setWName("Jaya");
        wf.setHusband(hs);
        
        session.save(hs);
        session.save(wf);
        System.out.println("Transaction Successfull");
        
        tx.commit();
		session.close();
        
    }
}
