package com;

 

 

 

import java.util.Scanner;

 

 

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

 

 

 

public class App {

 

 

    public static void main(String[] args) {

 

 

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

 

 

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

 

 

        Transaction tx = session.beginTransaction();

 

 

        Customer e = new Customer();

 

        Scanner sc = new Scanner(System.in);

 

       System.out.println("enter Cid: ");int cid= sc.nextInt();
        System.out.println("enter Cname: ");String cname =sc.next();
        System.out.println("enter place: ");String palce =sc.next();
        System.out.println("enter pan: ");String pan =sc.next();

 

 

         e.setCid(cid);
        e.setCname(cname);
        e.setPlace(palce);
        e.setPancard(pan);

 

 

        session.save(e);
        tx.commit();

 

 

        System.out.println("Inserted");
    }

 

 

 

}